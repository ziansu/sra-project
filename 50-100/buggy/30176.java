@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, params = { "removeSurvey" })
public java.util.concurrent.Callable<org.springframework.web.servlet.ModelAndView> removeSurvey(eu.dzhw.fdz.metadatamanagement.data.variablemanagement.documents.VariableDocument variableDocument, org.springframework.validation.BindingResult bindingResult) {
    return () -> {
        eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyResource resource = new eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyResource(eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyController.class, controllerLinkBuilderFactory);
        variableDocument.setVariableSurvey(null);
        validator.validate(variableDocument, bindingResult);
        org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("variables/modify");
        modelAndView.addObject("resource", resource);
        modelAndView.addObject("variableDocument", bindingResult.getModel().get("variableDocument"));
        return modelAndView;
    };
}