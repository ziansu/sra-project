public static void readAll(java.io.Reader reader, java.io.Writer writer) throws java.io.IOException {
    char[] buffer = new char[1024];
    int count = 0;
    do {
        count = reader.read(buffer);
        if (count > 0) {
            writer.write(buffer, 0, count);
        }
    } while (count > 0 );
}