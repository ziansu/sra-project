@br.com.caelum.vraptor.Post
@br.com.caelum.vraptor.Consumes(value = "application/json", options = br.com.caelum.vraptor.serialization.gson.WithRoot.class)
@br.com.caelum.vraptor.Path(value = "/manobra/valida")
public void validarManobra(model.entity.Cliente cliente, java.lang.String motivo) {
    try {
        model.facade.ValidaClienteManobraFacade f = new model.facade.ValidaClienteManobraFacade(cliente, model.Motivos.valueOf(motivo));
        f.validar();
        includeSerializer(f);
    } catch (java.lang.Exception e) {
        includeSerializer(e);
    }
}