@java.lang.Override
public void undo() throws java.lang.Exception {
    wave.getWave().insertData(deletedData, startPosition);
    wave.rebuildZoomCache();
    deletedData = null;
}