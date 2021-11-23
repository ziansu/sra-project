public void createHeader(java.lang.String[] header) throws java.io.IOException {
    lineCount = header.length;
    for (int i = 0; i < (header.length); i++) {
        writer.write(header[i]);
        if (i < ((header.length) - 1)) {
            writer.write(", ");
        }
    }
    writer.write("\n");
    writer.flush();
}