@java.lang.Override
public void writeTo(java.io.OutputStream outstream) throws java.io.IOException {
    if (outstream == null) {
        throw new java.lang.IllegalArgumentException("Output stream may not be null");
    }
    java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outstream, "UTF-8"));
    while (it.hasNext()) {
        java.lang.Object value = it.next();
        gson.toJson(value, writer);
        writer.newLine();
    } 
    writer.flush();
}