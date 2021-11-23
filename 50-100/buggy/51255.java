private void HAVEReceived(byte[] payload) throws java.lang.Exception {
    int pieceIndex = java.nio.ByteBuffer.wrap(payload).getInt();
    btLogger.writeToLog(btLogger.receivedHave(targetPeerID, pieceIndex));
    availPieces.add(pieceIndex);
    pieces.set(pieceIndex);
    checkFullFile();
    threadManager.hasFullFile();
    sendINTERESTEDorNOT();
}