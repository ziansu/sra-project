@java.lang.Override
public com.jivesoftware.os.lab.guts.api.Scanner rowScan(com.jivesoftware.os.lab.guts.ActiveScan activeScan, com.jivesoftware.os.lab.io.BolBuffer entryBuffer, com.jivesoftware.os.lab.io.BolBuffer entryKeyBuffer) throws java.lang.Exception {
    com.jivesoftware.os.lab.guts.ActiveScan scan = setup(activeScan);
    scan.setupRowScan(entryBuffer, entryKeyBuffer);
    return scan;
}