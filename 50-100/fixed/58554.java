public java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.AbstractFact> evaluate(eu.europa.ec.fisheries.uvms.rules.service.config.BusinessObjectType businessObjectType, java.lang.Object businessObject, java.util.Map<eu.europa.ec.fisheries.uvms.rules.service.config.ExtraValueType, java.lang.Object> map) throws eu.europa.ec.fisheries.uvms.rules.service.exception.RulesValidationException {
    java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.AbstractFact> facts = new java.util.ArrayList<>();
    eu.europa.ec.fisheries.uvms.rules.service.business.generator.AbstractGenerator generator = eu.europa.ec.fisheries.uvms.rules.service.business.BusinessObjectFactory.getBusinessObjFactGenerator(businessObjectType);
    generator.setBusinessObjectMessage(businessObject);
    mdrCacheServiceBean.loadMDRCache();
    generator.setExtraValueMap(map);
    facts.addAll(generator.generateAllFacts());
    templateEngine.evaluateFacts(facts);
    return facts;
}