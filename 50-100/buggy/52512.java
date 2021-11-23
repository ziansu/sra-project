@org.springframework.web.bind.annotation.GetMapping(value = "/contatos/{id}/update")
public java.lang.String alteraForm(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id, org.springframework.ui.Model model) {
    java.lang.System.out.println(("id: " + id));
    dsweb.model.Contato c = contatoDao.getContato(id);
    java.lang.System.out.println(("contato: " + c));
    model.addAttribute("contato", c);
    model.addAttribute("acao", "/contatos");
    return "altera_contato";
}