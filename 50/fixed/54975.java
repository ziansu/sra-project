@java.lang.Override
protected void setUpBroker(boolean clearDataDir) throws java.lang.Exception {
    if (clearDataDir && (dataFileDir.exists()))
        org.apache.commons.io.FileUtils.cleanDirectory(dataFileDir);
    
    super.setUpBroker(clearDataDir);
}