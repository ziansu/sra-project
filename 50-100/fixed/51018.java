public static com.sibilantsolutions.grison.driver.foscam.domain.VerifyRespText parse(byte[] data, int offset, int length) {
    com.sibilantsolutions.grison.driver.foscam.domain.VerifyRespText text = new com.sibilantsolutions.grison.driver.foscam.domain.VerifyRespText();
    java.nio.ByteBuffer bb = java.nio.ByteBuffer.wrap(data, offset, length);
    bb.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    short resultCodeNum = bb.getShort();
    text.resultCode = com.sibilantsolutions.grison.driver.foscam.domain.ResultCodeE.fromValue(resultCodeNum);
    if ((bb.position()) < length) {
        bb.position(((bb.position()) + 1));
    }
    return text;
}