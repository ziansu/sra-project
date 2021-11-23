@java.lang.Override
public java.io.OutputStream getOutputStream() throws java.io.IOException {
    java.lang.System.out.println("getOutputStream");
    java.io.ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
    synchronized(this) {
        if ((this.processedContent) == null)
            init();
        
    }
    buf.write(this.processedContent.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    return buf;
}