private static int encodePushDataOperation(final int opcode, final byte[] bytes, final byte[] partBytes, int pointer) {
    switch (opcode) {
        case 76 :
            bytes[pointer] = ((byte) (partBytes.length));
            pointer++;
        default :
            java.lang.System.arraycopy(partBytes, 0, bytes, pointer, partBytes.length);
            return pointer + (partBytes.length);
    }
}