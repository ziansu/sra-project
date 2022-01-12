public static java.util.Hashtable<java.lang.String, java.lang.String> maskAxis2ConfigSensitiveParameters(java.util.Hashtable<java.lang.String, java.lang.String> sensitiveParamsTable) {
    java.util.Hashtable<java.lang.String, java.lang.String> maskedParamsTable = new java.util.Hashtable<>(sensitiveParamsTable);
    if ((maskedParamsTable.get(JMSConstants.PARAM_JMS_PASSWORD)) != null) {
        maskedParamsTable.put(JMSConstants.PARAM_JMS_PASSWORD, org.apache.axis2.transport.jms.JMSUtils.MASKING_STRING);
    }
    if ((sensitiveParamsTable.get(JMSConstants.PARAM_NAMING_SECURITY_CREDENTIALS)) != null) {
        maskedParamsTable.put(JMSConstants.PARAM_NAMING_SECURITY_CREDENTIALS, org.apache.axis2.transport.jms.JMSUtils.MASKING_STRING);
    }
    return maskedParamsTable;
}