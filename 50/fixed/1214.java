@java.lang.Override
protected void instantiateGeneratorService(domain.businessrule.BusinessRule businessRule) {
    new domain.generator.GeneratorServiceImpl(businessRule.getTargetDatabase());
}