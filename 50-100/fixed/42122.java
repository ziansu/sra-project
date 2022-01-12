@java.lang.Override
public java.lang.Object apply(org.molgenis.data.mapping.model.AttributeMapping attributeMapping, org.molgenis.data.Entity sourceEntity) {
    java.lang.String algorithm = attributeMapping.getAlgorithm();
    if (org.apache.commons.lang3.StringUtils.isEmpty(algorithm)) {
        return null;
    }
    try {
        org.molgenis.data.support.MapEntity entity = createMapEntity(getSourceAttributeNames(attributeMapping.getAlgorithm()), sourceEntity);
        java.lang.Object value = org.molgenis.js.ScriptEvaluator.eval(algorithm, entity);
        return convert(value, attributeMapping.getTargetAttributeMetaData());
    } catch (java.lang.RuntimeException e) {
        return null;
    }
}