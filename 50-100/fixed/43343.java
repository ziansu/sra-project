public java.lang.String getContentWithoutUnicode() throws java.io.IOException {
    if ((file) == null) {
        return null;
    }
    java.lang.String output = "";
    try (java.io.FileInputStream i = new java.io.FileInputStream(file)) {
        int data;
        while ((data = i.read()) > 0) {
            if (data < 128) {
                output += ((char) (data));
            }
        } 
    }
    return output;
}