@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.concurrent.Callable<org.springframework.web.servlet.ModelAndView> get(eu.dzhw.fdz.metadatamanagement.data.variablemanagement.documents.VariableDocument variableDocument, org.springframework.validation.BindingResult bindingResult) {
    return () -> {
        eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyResource resource = new eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyResource(eu.dzhw.fdz.metadatamanagement.web.variablemanagement.modify.VariableModifyController.class, controllerLinkBuilderFactory);
        validator.validate(createVariableDocument(), bindingResult);
        org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("variables/modify");
        modelAndView.addObject("resource", resource);
        modelAndView.addObject("variableDocument", variableDocument);
        return modelAndView;
    };
}