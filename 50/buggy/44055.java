@java.lang.Override
public void addDataToSend(byte[] data, de.fu_berlin.agdb.nio_tools.core.Connection connection) {
    writeDataQueue.add(readDataPackage);
}