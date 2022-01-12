private static void writeUVarLong(com.pingcap.tikv.codec.CodecDataOutput cdo, long value) {
    while ((value - 128) >= 0) {
        cdo.writeByte((((byte) (value)) | 128));
        value >>>= 7;
    } 
    cdo.writeByte(((byte) (value)));
}