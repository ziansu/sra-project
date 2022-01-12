@java.lang.Override
public void resetToInitialState() throws java.lang.Exception {
    com.ibm.streamsx.hdfs.HDFS2FileSource.TRACE.info("Resest to initial");
    if (!(isDynamicFile())) {
        com.ibm.streamsx.hdfs.HDFS2FileSource.TRACE.info("Seek to 0");
        fSeekPosition = 0;
        fSeekToLine = 0;
        com.ibm.streamsx.hdfs.HDFS2FileSource.TRACE.info(("reset position: " + (fSeekPosition)));
        com.ibm.streamsx.hdfs.HDFS2FileSource.TRACE.info(("reset lineNumber: " + (fSeekToLine)));
        if (fProcessThreadDone) {
            com.ibm.streamsx.hdfs.HDFS2FileSource.TRACE.info("reset process thread");
            processThread = createProcessThread();
            fProcessThreadDone = false;
            startProcessing();
        }
    }
}