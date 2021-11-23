@org.springframework.web.bind.annotation.RequestMapping(value = "/RecommendMappingTask", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "text/plain")
public java.lang.String RecommendMappingTask(@org.springframework.web.bind.annotation.RequestParam(value = "openedMappingName")
java.lang.String openedMappingName) throws it.unibas.spicy.persistence.DAOException, java.io.IOException {
    gr.aueb.users.recommendation.ActionFindCommonMappingTasks commonMappings = new gr.aueb.users.recommendation.ActionFindCommonMappingTasks(gr.aueb.controllers.MappingController.user, openedMappingName);
    java.util.HashMap<java.lang.String, java.lang.String> commonScenarios = commonMappings.findCommonScenarions();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : commonScenarios.entrySet()) {
        java.lang.System.out.println((((entry.getKey()) + "/") + (entry.getValue())));
    }
    if (commonScenarios.isEmpty()) {
        return "No common scenarios have found";
    }
    return openedMappingName;
}