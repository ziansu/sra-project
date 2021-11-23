@org.springframework.web.bind.annotation.RequestMapping(value = "/Mensajes")
public java.lang.String Mensajes(org.springframework.ui.Model modelo, javax.servlet.http.HttpSession session) {
    if ((session.getAttribute("usuario")) == null) {
        return "index";
    }
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("Beans.xml");
    Repository.MensajeDAO mensajeDAO = ((Repository.MensajeDAO) (context.getBean("MensajeDAO")));
    Classes.Usuario usuario = ((Classes.Usuario) (session.getAttribute("usuario")));
    java.util.List<Classes.Mensaje> listaMensajes = mensajeDAO.cargarMensajes(usuario);
    modelo.addAttribute("listaMensajes", listaMensajes);
    return "Mensajes";
}