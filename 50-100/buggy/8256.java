private java.lang.String getParameterValueWithContext(org.talend.core.model.process.IElement elem, java.lang.String key, org.talend.core.model.process.IContext context, org.talend.core.model.process.IElementParameter basePropertyParameter) {
    if ((elem == null) || (key == null)) {
        return "";
    }
    java.lang.String actualKey = this.getParaNameFromRepositoryName(key, basePropertyParameter);
    if (actualKey != null) {
        return fetchElementParameterValue(elem, context, actualKey);
    }else {
        return fetchElementParameterValue(elem, context, key);
    }
}