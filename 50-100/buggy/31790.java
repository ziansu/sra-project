protected org.opennms.netmgt.config.javamail.SendmailConfig getSendmailConfig(org.opennms.netmgt.alarmd.api.NorthboundAlarm alarm) {
    java.util.Map<java.lang.String, java.lang.Object> mapping = createMapping(new java.util.HashMap<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>>(), alarm);
    final java.lang.String subject = org.opennms.core.utils.PropertiesUtils.substitute(m_emailSubjectFormat, mapping);
    m_sendmail.getSendmailMessage().setSubject(subject);
    final java.lang.String body = org.opennms.core.utils.PropertiesUtils.substitute(m_emailBodyFormat, mapping);
    m_sendmail.getSendmailMessage().setBody(body);
    return m_sendmail;
}