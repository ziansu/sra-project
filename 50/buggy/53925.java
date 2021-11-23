public void writeln(java.lang.String line) throws java.io.IOException {
    out.write((line + (server.basics.HttpMessage.enter)));
}