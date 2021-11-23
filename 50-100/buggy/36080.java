@org.springframework.web.bind.annotation.RequestMapping(value = "/module/patientdashboard/autoCompleteProvisionalDianosis.htm", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String provisionalDianosis(@org.springframework.web.bind.annotation.RequestParam(value = "term", required = false)
java.lang.String name, org.springframework.ui.Model model) {
    java.util.List<org.openmrs.Concept> diagnosis = new java.util.ArrayList<org.openmrs.Concept>();
    org.openmrs.module.hospitalcore.PatientDashboardService dashboardService = org.openmrs.api.context.Context.getService(org.openmrs.module.hospitalcore.PatientDashboardService.class);
    diagnosis = dashboardService.searchDiagnosis(name);
    java.lang.System.out.println(("come here: " + name));
    model.addAttribute("diagnosis", diagnosis);
    return "/module/patientdashboard/autocomplete/autoCompleteProvisionalDianosis";
}