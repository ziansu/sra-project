protected java.lang.Integer doDeleteMessages(javax.management.MBeanServerConnection mbsc, javax.management.ObjectName destination, java.lang.String selector) {
    try {
        java.lang.Integer deleted = ((java.lang.Integer) (mbsc.invoke(destination, "deleteMessages", new java.lang.Object[]{ selector }, new java.lang.String[]{ java.lang.String.class.getName() })));
        return deleted;
    } catch (java.lang.Exception e) {
        throw new eu.domibus.jms.spi.InternalJMSException("Failed to build JMS destination map", e);
    }
}