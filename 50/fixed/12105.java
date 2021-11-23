public static void writeVarLong(com.pingcap.tikv.codec.CodecDataOutput cdo, long value) {
    long ux = value << 1;
    if (value < 0) {
        ux = ~ux;
    }
    com.pingcap.tikv.types.IntegerType.writeUVarLong(cdo, ux);
}