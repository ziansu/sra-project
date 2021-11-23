public static java.lang.String readFile(java.lang.String fileName) {
    try {
        java.io.FileReader reader = new java.io.FileReader(fileName);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader);
        java.lang.String line = "";
        java.lang.StringBuffer buffer = new java.lang.StringBuffer();
        while ((line = bufferedReader.readLine()) != null) {
            buffer.append(line);
        } 
        reader.close();
        return buffer.toString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "";
}