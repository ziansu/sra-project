public static void closeInputStream(java.io.InputStream input) {
    try {
        if (input != null) {
            input.close();
        }
    } catch (java.io.IOException ioe) {
        org.wso2.carbon.identity.core.util.IdentityIOStreamUtils.log.error("Error occurred while closing Input stream", ioe);
    }
}