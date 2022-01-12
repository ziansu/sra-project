public void controller(org.openmrs.ui.framework.fragment.FragmentModel fragmentModel) {
    org.openmrs.module.chartsearch.SearchAPI searchAPI = org.openmrs.module.chartsearch.SearchAPI.getInstance();
    java.util.ArrayList<java.lang.String> resultList = new java.util.ArrayList<java.lang.String>();
    resultList.add(org.openmrs.module.chartsearch.GeneratingJson.generateJson(true));
    searchAPI.clearResults();
    fragmentModel.addAttribute("resultList", resultList);
}