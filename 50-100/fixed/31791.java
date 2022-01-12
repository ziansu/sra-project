public org.versly.rest.wsdoc.impl.RestDocumentation.RestApi.Resource.UrlFields getResourceUrlSubstitutions() {
    org.versly.rest.wsdoc.impl.RestDocumentation.RestApi.Resource.UrlFields aggregateUrlFields = new org.versly.rest.wsdoc.impl.RestDocumentation.RestApi.Resource.UrlFields();
    for (org.versly.rest.wsdoc.impl.RestDocumentation.RestApi.Resource.Method method : _methods.values()) {
        org.versly.rest.wsdoc.impl.RestDocumentation.RestApi.Resource.UrlFields fields = method.getMethodSpecificUrlSubstitutions();
        aggregateUrlFields.getFields().putAll(fields.getFields());
    }
    return aggregateUrlFields;
}