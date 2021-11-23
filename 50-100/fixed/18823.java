private java.lang.String ATR(int slotNumber) throws java.lang.Exception {
    byte[] response = new byte[0];
    try {
        response = reader.getAtr(slotNumber);
    } catch (com.acs.smartcard.ReaderException e) {
        throw new java.lang.Exception(e.getMessage());
    }
    return toHexString(response, response.length);
}