@org.springframework.web.bind.annotation.RequestMapping(value = "/addEngin", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addEnginPost(@org.springframework.web.bind.annotation.PathVariable
int idC, org.springframework.ui.Model model, @javax.validation.Valid
me.momarija.bioui.domains.Engin engin, org.springframework.validation.BindingResult bindingResult, @org.springframework.web.bind.annotation.RequestParam(value = "file", required = false)
org.springframework.web.multipart.MultipartFile file) {
    if (bindingResult.hasErrors()) {
        model.addAttribute("title", "Erreur");
        return "admin/enginForm";
    }
    if (file.isEmpty())
        engin.setPhoto("photo1.jpg");
    else
        engin.setPhoto(storageService.store(file));
    
    adminEnginService.addEngin(engin, idC);
    return "redirect:/admin/chantier/" + idC;
}