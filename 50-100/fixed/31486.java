@org.springframework.web.bind.annotation.RequestMapping(value = "/cervejas/novo", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String cadastrar(@javax.validation.Valid
com.lopes.cervejaria.model.Cerveja cerveja, org.springframework.validation.BindingResult result, org.springframework.ui.Model model, org.springframework.web.servlet.mvc.support.RedirectAttributes attributes) {
    if (result.hasErrors()) {
        model.addAttribute("mensagem", "Erro no formulário");
        return "cerveja/cadastro-cerveja";
    }
    attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
    return "redirect:/cervejas/novo";
}