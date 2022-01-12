public static java.lang.String readFile(java.io.File f) throws java.io.IOException {
    java.io.FileReader reader = new java.io.FileReader(f);
    char[] chars = new char[((int) (f.length()))];
    reader.read(chars);
    java.lang.String content = new java.lang.String(chars);
    reader.close();
    return content;
}