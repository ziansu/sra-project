@java.lang.Override
public void writeComment(java.lang.Object comment) throws java.io.IOException {
    if (comment == null) {
        throw new java.lang.NullPointerException(com.sun.faces.util.MessageUtils.getExceptionMessageString(MessageUtils.NULL_PARAMETERS_ERROR_MESSAGE_ID));
    }
    if (writingCdata) {
        return ;
    }
    closeStartIfNecessary();
    writer.write("<!--");
    java.lang.String str = comment.toString();
    ensureTextBufferCapacity(str);
    com.sun.faces.util.HtmlUtils.writeText(writer, true, true, false, buffer, str, textBuffer);
    writer.write("-->");
}