public java.lang.String ReadFile(java.lang.String filePath) {
    java.lang.String line;
    java.lang.String archivo = "";
    java.io.BufferedReader br = null;
    try {
        br = new java.io.BufferedReader(new java.io.FileReader(filePath));
        while ((line = br.readLine()) != null) {
            archivo += line + "\n";
        } 
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("**Error reading a file (NotFoundException)**");
    } finally {
    }
    return archivo;
}