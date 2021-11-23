@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, name = "saveProduct")
public org.springframework.web.servlet.ModelAndView save(@javax.validation.Valid
br.com.casadocodigo.loja.models.Product product, org.springframework.validation.BindingResult bindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (bindingResult.hasErrors())
        return form();
    
    productDAO.save(product);
    redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso");
    return new org.springframework.web.servlet.ModelAndView("redirect:produtos");
}