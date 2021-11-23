@java.lang.Override
public void consume(java.lang.String input) {
    executeWriteCall(driveClient.setRoute(input, track.getOid(), route.getOid()), consumer);
}