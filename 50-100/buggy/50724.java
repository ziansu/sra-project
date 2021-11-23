private boolean fetchNextRecord() throws java.io.IOException, java.lang.InterruptedException {
    final long status = reader.readRecord(buffer);
    if ((status > 0) && (writer.acceptMoreRecords())) {
        writer.writeRecord(buffer);
        writer.flush();
        return true;
    }else {
        writer.setStatus((status < 0 ? org.jetel.graph.DebugDataStatus.fromCode(status) : DebugDataStatus.TRUNCATED_DATA));
        writer.close();
        return false;
    }
}