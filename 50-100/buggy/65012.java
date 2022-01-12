@java.lang.Override
public java.lang.String getText() throws javax.jms.JMSException {
    org.apache.activemq.util.ByteSequence content = getContent();
    if (((text) == null) && (content != null)) {
        text = decodeContent(content);
        setContent(null);
        setCompressed(false);
    }
    return text;
}