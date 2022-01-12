@java.lang.Override
public com.jivesoftware.os.lab.guts.api.Scanner pointScan(com.jivesoftware.os.lab.guts.ActiveScan activeScan, byte[] key, com.jivesoftware.os.lab.io.BolBuffer entryBuffer, com.jivesoftware.os.lab.io.BolBuffer entryKeyBuffer) throws java.lang.Exception {
    com.jivesoftware.os.lab.guts.ActiveScan pointScan = setup(activeScan);
    long fp = pointScan.getInclusiveStartOfRow(new com.jivesoftware.os.lab.io.BolBuffer(key), entryBuffer, entryKeyBuffer, true);
    if (fp < 0) {
        return null;
    }
    pointScan.setupPointScan(fp, entryBuffer);
    return pointScan;
}