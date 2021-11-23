public void appendToConsoleLog(com.thoughtworks.go.domain.JobIdentifier jobIdentifier, java.lang.String text) throws com.thoughtworks.go.domain.exception.IllegalArtifactLocationException, java.io.IOException {
    java.io.File file = findConsoleArtifact(jobIdentifier);
    updateConsoleLog(file, new java.io.ByteArrayInputStream(text.getBytes()));
}