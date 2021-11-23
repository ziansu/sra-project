public void read() throws java.io.FileNotFoundException, java.io.IOException {
    java.io.File file = new java.io.File(this.fileName);
    int fileSize = ((int) (file.length()));
    char[] s = new char[fileSize];
    java.io.FileReader fr = new java.io.FileReader(file);
    fr.read(s);
    java.lang.String data = new java.lang.String(s);
    fileDetails = new Content(data);
}