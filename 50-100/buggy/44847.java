public java.lang.String compose(org.jbei.ice.lib.entry.sequence.Sequence sequence, org.jbei.ice.lib.entry.sequence.IFormatter formatter) {
    java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream();
    try {
        formatter.format(sequence, byteStream);
    } catch (org.jbei.ice.lib.entry.sequence.FormatterException | java.io.IOException e) {
        org.jbei.ice.lib.common.logging.Logger.error(e);
    }
    return byteStream.toString();
}