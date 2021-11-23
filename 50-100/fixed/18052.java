public static java.lang.String readInputDataBlank(java.io.File inputFile) {
    java.io.BufferedReader file;
    java.lang.String line;
    java.lang.String input = null;
    try {
        file = new java.io.BufferedReader(new java.io.FileReader(inputFile));
        input = file.readLine();
        while ((line = file.readLine()) != null) {
            input = (input + "\n") + line;
        } 
        file.close();
    } catch (java.io.IOException e) {
        return null;
    }
    return input;
}