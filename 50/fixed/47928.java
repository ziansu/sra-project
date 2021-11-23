public static void flushOutputStream(java.io.OutputStream output) {
    try {
        if (output != null) {
            output.flush();
        }
    } catch (java.io.IOException ioe) {
        org.wso2.carbon.identity.core.util.IdentityIOStreamUtils.log.error("Error occurred while flushing Output stream", ioe);
    }
}