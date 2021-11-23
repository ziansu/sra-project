public boolean nextKeyValueOrg() throws java.io.IOException, java.lang.InterruptedException {
    while (((curReader) == null) || (!(curReader.nextKeyValue()))) {
        if (!(initNextRecordReader())) {
            return false;
        }
    } 
    return true;
}