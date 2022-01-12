@org.springframework.web.bind.annotation.RequestMapping(value = "/Perfil")
public java.lang.String Perfil(org.springframework.ui.Model modelo, javax.servlet.http.HttpSession session) {
    if ((session.getAttribute("usuario")) == null) {
        return "index";
    }
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("Beans.xml");
    Repository.UsuarioDAO usuarioDAO = ((Repository.UsuarioDAO) (context.getBean("UsuarioDAO")));
    Classes.Usuario usuario = ((Classes.Usuario) (session.getAttribute("usuario")));
    Classes.Usuario datosUsuario = usuarioDAO.getUsuario(usuario);
    modelo.addAttribute("datosUsuario", datosUsuario);
    return "Perfil";
}