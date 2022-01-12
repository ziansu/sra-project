public java.lang.String getResultsFromTheServer(org.openmrs.ui.framework.fragment.FragmentModel model, @org.openmrs.ui.framework.annotation.BindParams
org.openmrs.module.chartsearch.SearchPhrase search_phrase, @org.springframework.web.bind.annotation.RequestParam(value = "patientId")
org.openmrs.Patient patient, javax.servlet.http.HttpServletRequest request) {
    org.openmrs.module.chartsearch.SearchAPI searchAPIInstance = org.openmrs.module.chartsearch.SearchAPI.getInstance();
    searchAPIInstance.clearResults();
    org.openmrs.module.chartsearch.page.controller.ChartsearchPageController.searchAndReturnResults(search_phrase, patient, request, searchAPIInstance);
    return org.openmrs.module.chartsearch.GeneratingJson.generateJson();
}