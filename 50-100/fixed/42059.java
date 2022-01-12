private org.cerberus.entity.MessageEvent doActionCalculateProperty(java.lang.String object, java.lang.String propertyName) {
    org.cerberus.entity.MessageEvent message;
    if ((org.cerberus.util.StringUtil.isNullOrEmpty(object)) && (org.cerberus.util.StringUtil.isNullOrEmpty(propertyName))) {
        message = new org.cerberus.entity.MessageEvent(org.cerberus.entity.MessageEventEnum.PROPERTY_FAILED_CALCULATE_OBJECTPROPERTYNULL);
    }else {
        message = new org.cerberus.entity.MessageEvent(org.cerberus.entity.MessageEventEnum.ACTION_SUCCESS_PROPERTYCALCULATED);
        message.setDescription(message.getDescription().replaceAll("%PROP%", propertyName));
    }
    return message;
}