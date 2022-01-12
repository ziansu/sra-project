@org.springframework.web.bind.annotation.ModelAttribute(value = "reasoners")
public java.util.List<java.lang.String> getSupportedReasoners() {
    java.util.List<java.lang.String> result = new java.util.LinkedList<java.lang.String>();
    for (int i = 0; i < (org.dllearner.reasoning.ReasonerImplementation.values().length); i++) {
        result.add(org.dllearner.reasoning.ReasonerImplementation.values()[i].name());
    }
    return result;
}