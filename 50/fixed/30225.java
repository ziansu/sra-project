@org.springframework.web.bind.annotation.GetMapping(value = "/contatos/add")
public java.lang.String insereForm(org.springframework.ui.Model model) {
    model.addAttribute("contato", new dsweb.model.Contato());
    return "insere_contato";
}