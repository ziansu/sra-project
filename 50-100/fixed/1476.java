private void sendConfirmSession(byte[] sessionKey) throws java.security.InvalidKeyException, javax.crypto.BadPaddingException {
    byte[] letter = ink.aquar.scp.v1.SecureDelivery.LetterWrapper.wrap(sessionKey);
    ink.aquar.scp.v1.SecureDelivery.Packet packet = new ink.aquar.scp.v1.SecureDelivery.Packet(sessionId, ink.aquar.scp.v1.SecureDelivery.Operations.CONFIRM_SESSION, 0, letter);
    basicMessenger.send(packet.wrap());
}