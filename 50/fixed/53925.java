public void writeln(java.lang.String line) throws java.io.IOException {
    if ((line.length()) > 0) {
        out.write((line + (server.basics.HttpMessage.enter)));
    }else {
        out.write(server.basics.HttpMessage.enter);
    }
}