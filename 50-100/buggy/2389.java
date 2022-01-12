@java.lang.Override
public java.io.Reader getResourceReader(java.lang.String name, java.lang.String encoding) throws org.apache.velocity.exception.ResourceNotFoundException {
    java.io.InputStream stream = com.intellij.codeInsight.generation.VelocityIncludesClassLoader.class.getResourceAsStream(("/com/intellij/codeInsight/generation/" + name));
    try {
        return new java.io.InputStreamReader(stream, encoding);
    } catch (java.io.UnsupportedEncodingException e) {
        throw new org.apache.velocity.exception.ResourceNotFoundException(e);
    }
}