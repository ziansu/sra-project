public void returnResponse() {
    int c;
    try {
        java.lang.System.out.println("antes");
        java.io.FileInputStream f = new java.io.FileInputStream(resource);
        java.lang.System.out.println("depois");
        while ((c = f.read()) != (-1)) {
            output.write(c);
        } 
        output.write(1);
        f.close();
    } catch (java.io.IOException e) {
        java.lang.System.err.println("IOException in reading Web server");
    }
}