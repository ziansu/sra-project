protected void readResult(java.io.InputStream in) throws java.io.IOException {
    readRawData(in);
    try {
        checkForErrors();
        fillBuffer();
        performCalculations();
        error = false;
    } catch (com.cardiag.models.commands.BadResponseException e) {
        error = true;
    }
}