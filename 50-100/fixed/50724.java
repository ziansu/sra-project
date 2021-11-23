private boolean fetchNextRecord() throws java.io.IOException, java.lang.InterruptedException {
    final long status = reader.readRecord(buffer);
    if ((status > 0) && (writer.acceptMoreRecords())) {
        writer.writeRecord(buffer);
        writer.flush();
        return true;
    }else {
        writer.close();
        return false;
    }
}