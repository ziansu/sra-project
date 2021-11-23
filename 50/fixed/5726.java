public int setFileToRecord(java.io.File file) {
    int rec_result;
    filetorecord = file;
    rec_result = initialize();
    if ((filetorecord) == null) {
        rec_result = -1;
    }
    return rec_result;
}