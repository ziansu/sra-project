public controllers.Result postCadastro() {
    com.fasterxml.jackson.databind.JsonNode json = request().body().asJson();
    controllers.Usuario usuario = play.libs.Json.fromJson(json, controllers.Usuario.class);
    try {
        controllers.AutenticacaoController.sistemaUsuarios.adicionarUsuario(usuario);
    } catch (controllers.DadosInvalidosException exception) {
        return badRequest(exception.getMessage());
    }
    sistemasInfo.SistemaLog.novaMensagemLog(((usuario.getEmail()) + " acabou de se cadastrar no sistema"));
    return ok(play.libs.Json.toJson(usuario));
}