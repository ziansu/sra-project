@br.com.fiap.am.controller.Post(value = "/user")
@br.com.fiap.am.authorization.Public
@br.com.fiap.am.controller.Consumes(value = "application/json")
public void saveUser(@javax.validation.Valid
br.com.fiap.am.model.Client client) {
    validator.onErrorSendBadRequest();
    if ((client.getId()) == null) {
        users.insert(client);
    }else {
        users.update(client);
    }
    result.use(br.com.caelum.vraptor.view.Results.http()).setStatusCode(201);
    result.use(br.com.caelum.vraptor.view.Results.json()).withoutRoot().from(client).recursive().serialize();
}