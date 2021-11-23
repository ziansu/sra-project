public int setFileToRecord(java.io.File file) {
    int rec_result;
    filetorecord = file;
    rec_result = initialize();
    return rec_result;
}