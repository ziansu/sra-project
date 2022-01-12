public void returnResponse() {
    int c;
    try {
        java.io.FileInputStream f = new java.io.FileInputStream(resource);
        while ((c = f.read()) != (-1)) {
            output.write(c);
        } 
        output.write(1);
        f.close();
    } catch (java.io.IOException e) {
        java.lang.System.err.println("IOException in reading Web server");
    }
}