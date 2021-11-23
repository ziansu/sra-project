@java.lang.Override
public void setProperty(org.apache.qpid.jms.provider.amqp.message.AmqpJmsMessageFacade message, java.lang.Object value) throws javax.jms.JMSException {
    java.lang.Long rc = ((java.lang.Long) (org.apache.qpid.jms.util.TypeConversionSupport.convert(value, java.lang.Long.class)));
    if (rc == null) {
        throw new javax.jms.JMSException((((("Property " + (org.apache.qpid.jms.provider.amqp.message.AmqpMessageSupport.JMS_AMQP_TTL)) + " cannot be set from a ") + (value.getClass().getName())) + "."));
    }
    message.setAmqpTimeToLiveOverride(rc);
}