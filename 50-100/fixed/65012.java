@java.lang.Override
public java.lang.String getText() throws javax.jms.JMSException {
    org.apache.activemq.util.ByteSequence content = getContent();
    java.lang.String text = this.text;
    if ((text == null) && (content != null)) {
        text = decodeContent(content);
        this.text = text;
        setContent(null);
        setCompressed(false);
    }
    return text;
}