@java.lang.Override
protected java.lang.String[] getStringArrayWithoutRegrister(java.lang.String name) {
    java.lang.String[] values = request.getParameterValues(name);
    if (((com.publiccms.common.tools.CommonUtils.notEmpty(values)) && (1 == (values.length))) && (0 <= (values[0].indexOf(com.publiccms.common.handler.COMMA_DELIMITED)))) {
        return org.apache.commons.lang3.StringUtils.split(values[0], com.publiccms.common.handler.COMMA_DELIMITED);
    }
    return values;
}