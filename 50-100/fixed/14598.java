@org.springframework.web.bind.annotation.RequestMapping(value = "/create", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.annotation.Secured(value = cz.muni.fi.pa165.airport_manager.config.DataConfiguration.ROLE_AIRPORT)
public java.lang.String create(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "destinationToCreate")
cz.muni.fi.pa165.airport_manager.dto.DestinationCreateDTO destination, org.springframework.ui.Model model, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    if (cz.muni.fi.pa165.airport_manager.controller.DestinationController.isValid(destination)) {
        java.lang.Long id = destinationFacade.create(destination);
        redirectAttributes.addFlashAttribute("alert_success", (("Destination " + (destination.getName())) + " was created"));
        return "redirect:/destinations/detail/" + id;
    }else {
        model.addAttribute("warning", "Destination inputs are not correct");
        model.addAttribute("destinationToCreate", destination);
        return "destination/new";
    }
}