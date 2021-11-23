private java.lang.Integer readScore() {
    try (java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(file.getAbsoluteFile()))) {
        return new java.lang.Integer(in.readLine());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}