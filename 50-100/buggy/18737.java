@java.lang.Override
public void write(java.io.OutputStream output) throws java.io.IOException, javax.ws.rs.WebApplicationException {
    int len = 0;
    try {
        while ((len = stream.read(buffer)) > 0) {
            output.write(buffer, 0, len);
        } 
    } finally {
        if (output != null) {
            output.close();
        }
    }
}