private java.io.File createTempFile(java.lang.String body) {
    java.io.File temp = null;
    if (!(body.contains("definitions"))) {
        return null;
    }
    try {
        temp = java.io.File.createTempFile("temp", ".wsdl");
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(temp));
        bw.write(body);
        bw.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return temp;
}