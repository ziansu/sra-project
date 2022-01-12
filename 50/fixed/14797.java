boolean validatePanel() {
    if (!(imageWriterPathIsValid())) {
        return false;
    }
    return enableNext;
}