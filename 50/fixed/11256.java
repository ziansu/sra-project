@org.springframework.web.bind.annotation.RequestMapping(value = "/last/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<org.sistema.springmvc.forms.models.Cliente> lastClients(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id) {
    return clienteDAO.lastClients(id);
}