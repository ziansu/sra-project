@br.com.fiap.am.controller.Post(value = "/door")
@br.com.fiap.am.authorization.Public
@br.com.fiap.am.controller.Consumes(value = "application/json")
public void saveDoor(@javax.validation.Valid
br.com.fiap.am.model.Door door) {
    validator.onErrorSendBadRequest();
    result.use(br.com.caelum.vraptor.view.Results.http()).setStatusCode(201);
    if ((door.getId()) == null) {
        ports.insert(door);
    }else {
        ports.update(door);
    }
    result.use(br.com.caelum.vraptor.view.Results.json()).withoutRoot().from(door).recursive().serialize();
}