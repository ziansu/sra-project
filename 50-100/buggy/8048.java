private void setMessage(final org.apache.logging.log4j.message.Message msg) {
    if (msg instanceof org.apache.logging.log4j.message.ReusableMessage) {
        org.apache.logging.log4j.message.ReusableMessage reusable = ((org.apache.logging.log4j.message.ReusableMessage) (msg));
        reusable.formatTo(getMessageTextForWriting());
        parameters = reusable.swapParameters(parameters);
        parameterCount = reusable.getParameterCount();
    }else {
        if ((!(org.apache.logging.log4j.core.util.Constants.FORMAT_MESSAGES_IN_BACKGROUND)) && (msg != null)) {
            msg.getFormattedMessage();
        }
        this.message = msg;
    }
}