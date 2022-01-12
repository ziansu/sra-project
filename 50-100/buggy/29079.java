private void append(java.io.FileWriter writer, java.io.File src) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.FileReader reader = new java.io.FileReader(src);
    com.fillumina.emailrecoverer.FileLoaderIterator iterable = new com.fillumina.emailrecoverer.FileLoaderIterator(reader, 0);
    for (java.lang.String line : iterable) {
        writer.append(line).append('\n');
    }
    writer.flush();
    writer.close();
}