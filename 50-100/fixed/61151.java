public static java.io.InputStream replaceMacro(java.io.InputStream original, hudson.util.VariableResolver<java.lang.String> variableResolver) throws java.io.IOException {
    if (variableResolver == null) {
        return original;
    }
    try {
        java.lang.String content = org.apache.commons.io.IOUtils.toString(original, Constants.DEFAULT_CHARSET);
        content = hudson.Util.replaceMacro(content, variableResolver);
        if (content != null) {
            return new java.io.ByteArrayInputStream(content.getBytes(Constants.DEFAULT_CHARSET));
        }else {
            throw new java.lang.IllegalArgumentException(com.microsoft.jenkins.kubernetes.Messages.JobContext_nullContent());
        }
    } finally {
        original.close();
    }
}