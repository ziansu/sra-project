public void saveChanges(java.lang.String histFileName) throws java.io.IOException {
    serializer.initWriter(histFileName);
    serializer.write(messages);
    serializer.closeWriter();
}