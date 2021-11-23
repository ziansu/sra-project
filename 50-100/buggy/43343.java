public java.lang.String getContentWithoutUnicode() throws java.io.IOException {
    java.io.FileInputStream i = new java.io.FileInputStream(file);
    java.lang.String output = "";
    int data;
    while ((data = i.read()) > 0) {
        if (data < 128) {
            output += ((char) (data));
        }
    } 
    return output;
}