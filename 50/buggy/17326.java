@java.lang.Override
public void setNewNumber(java.lang.Integer queryNumber) throws java.io.IOException {
    java.lang.String numFilePath = java.nio.file.Paths.get(dbPath, "num.seq").toString();
    write(numFilePath, queryNumber.toString());
}