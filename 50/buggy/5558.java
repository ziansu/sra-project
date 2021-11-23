@org.springframework.web.bind.annotation.RequestMapping(value = "/module/urandumodule/manage", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public void manage(org.springframework.ui.ModelMap model) {
    model.addAttribute("user", org.openmrs.api.context.Context.getAuthenticatedUser());
    org.openmrs.api.context.Context.getPatientService().savePatient(new org.openmrs.Patient());
}