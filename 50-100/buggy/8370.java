protected org.jbrackets.TemplateEngine autodetectTemplateEngine() throws org.springframework.beans.BeansException {
    try {
        org.jbrackets.web.JBracketsConfig jBracketsConfig = org.springframework.beans.factory.BeanFactoryUtils.beanOfTypeIncludingAncestors(getApplicationContext(), org.jbrackets.web.JBracketsConfig.class, true, false);
        log.info("using provided jBracketConfig.");
        setEvalContext(jBracketsConfig.getEvaluationContext());
        return jBracketsConfig.getTemplateEngine();
    } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException ex) {
        org.jbrackets.web.JBracketsConfig jBracketsConfig = new org.jbrackets.web.JBracketsConfig();
        jBracketsConfig.afterPropertiesSet();
        setEvalContext(jBracketsConfig.getEvaluationContext());
        log.info("using default jBracketConfig.");
        return jBracketsConfig.getTemplateEngine();
    }
}