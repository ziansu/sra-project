@org.springframework.web.bind.annotation.RequestMapping(value = "/autenticar-usuario", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String autenticarUsuario(avaliador.model.Usuario usuarioRecebido, javax.servlet.http.HttpSession session) {
    avaliador.model.Usuario usuarioRetornado = usuarioDao.validarUsuario(usuarioRecebido.getLogin(), usuarioRecebido.getSenha());
    if (usuarioRetornado != null) {
        session.setAttribute("usuarioLogado", true);
        if ((usuarioRetornado.getTipoUsuario()) == (avaliador.model.NivelUsuario.ADMINISTRADOR)) {
            session.setAttribute("ehAdministrador", true);
        }
        return "redirect:/index";
    }
    return "login";
}