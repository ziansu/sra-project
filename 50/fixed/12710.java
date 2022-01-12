@org.springframework.web.bind.annotation.RequestMapping(value = "/modules", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showAllModules(org.springframework.ui.Model model) {
    java.util.List<pl.edu.uj.fais.wpz.msom.entities.Module> modules = moduleService.findAll();
    model.addAttribute("moduleList", modules);
    return "modules/list";
}