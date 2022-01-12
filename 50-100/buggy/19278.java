public static void consumeAndDiscardMessage(org.apache.axis2.context.MessageContext msgContext) throws org.apache.axis2.AxisFault {
    final org.apache.synapse.transport.passthru.Pipe pipe = ((org.apache.synapse.transport.passthru.Pipe) (msgContext.getProperty(PassThroughConstants.PASS_THROUGH_PIPE)));
    if (pipe != null) {
        java.io.InputStream in = pipe.getInputStream();
        try {
            if ((in != null) && ((in.available()) > 0)) {
                org.apache.commons.io.IOUtils.copy(in, new org.apache.commons.io.output.NullOutputStream());
            }
        } catch (java.io.IOException exception) {
            org.apache.synapse.transport.passthru.util.RelayUtils.handleException("Error when consuming the input stream to discard ", exception);
        }
    }
}