@org.springframework.web.bind.annotation.RequestMapping(value = "/results", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String search(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
java.lang.String searchType, @org.springframework.web.bind.annotation.RequestParam
java.lang.String searchTerm) {
    java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> jobs;
    model.addAttribute("columns", ListController.columnChoices);
    if (searchType.equals("all")) {
        jobs = org.launchcode.models.JobData.findByValue(searchTerm);
    }else {
        jobs = org.launchcode.models.JobData.findByColumnAndValue(searchType, searchTerm);
    }
    model.addAttribute("jobs", jobs);
    return "search";
}