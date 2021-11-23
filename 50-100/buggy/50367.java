@br.com.caelum.vraptor.Post
public void login(br.ufc.quixada.model.Usuario usuario, java.lang.Long papel) {
    java.lang.String hash = org.apache.commons.codec.digest.DigestUtils.sha256Hex(usuario.getSenha());
    usuario.setSenha(hash);
    br.ufc.quixada.model.Usuario usuarioCarregado = udao.buscarByLoginSenha(usuario);
    br.ufc.quixada.model.Papel papelCarregado = pdao.buscar(papel);
    validador.validarAutenticacao(usuarioCarregado, papelCarregado);
    usuarioSessao.autenticar(usuarioCarregado, papelCarregado);
    validador.confirmarLogin();
    resultado.redirectTo(br.ufc.quixada.control.IndexController.class).index();
}