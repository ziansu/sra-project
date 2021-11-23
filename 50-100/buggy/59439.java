public controllers.Result postCadastro() {
    com.fasterxml.jackson.databind.JsonNode json = request().body().asJson();
    java.lang.System.out.println(json.toString());
    controllers.Usuario usuario = play.libs.Json.fromJson(json, controllers.Usuario.class);
    try {
        controllers.AutenticacaoController.sistemaUsuarios.adicionarUsuario(usuario);
    } catch (controllers.DadosInvalidosException exception) {
        return badRequest(exception.getMessage());
    }
    sistemasInfo.SistemaLog.novaMensagemLog(((usuario.getEmail()) + " acabou de se cadastrar no sistema"));
    return ok(play.libs.Json.toJson(usuario));
}