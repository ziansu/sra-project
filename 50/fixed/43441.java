@java.lang.Override
public void consume(java.lang.String input) {
    executeWriteCall(driveClient.delete(input, track.getOid()), consumer);
}