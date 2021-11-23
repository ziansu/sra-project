public static void setPropertyValue(alien4cloud.model.topology.NodeTemplate nodeTemplate, alien4cloud.model.components.PropertyDefinition propertyDefinition, java.lang.String propertyName, java.lang.Object propertyValue) {
    if ((nodeTemplate.getProperties()) == null) {
        nodeTemplate.setProperties(com.google.common.collect.Maps.<java.lang.String, alien4cloud.model.components.AbstractPropertyValue>newHashMap());
    }
    alien4cloud.utils.PropertyUtil.doSetPropertyValue(nodeTemplate.getProperties(), propertyDefinition, propertyName, propertyValue);
}