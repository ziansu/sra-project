@org.springframework.web.bind.annotation.RequestMapping(value = { "/edit-workPackage-{id}" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String editWorkPackage(@org.springframework.web.bind.annotation.PathVariable
int id, org.springframework.ui.ModelMap model) {
    com.websystique.springmvc.model.WorkPackage workPackage = workPackageService.findById(id);
    model.addAttribute("workPackage", workPackage);
    model.addAttribute("edit", true);
    model.addAttribute("loggedinuser", getPrincipal());
    return "workPackage";
}