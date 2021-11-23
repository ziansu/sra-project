private java.lang.String power(int slotNumber, int action) throws java.lang.Exception {
    byte[] response = new byte[0];
    try {
        response = reader.power(slotNumber, action);
    } catch (com.acs.smartcard.ReaderException e) {
        throw new java.lang.Exception(e.getMessage());
    }
    return toHexString(response, response.length);
}