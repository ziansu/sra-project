public static long readLongFully(com.pingcap.tikv.codec.CodecDataInput cdi) {
    int flag = cdi.readByte();
    switch (flag) {
        case INT_FLAG :
            return com.pingcap.tikv.types.IntegerType.readLong(cdi);
        case VARINT_FLAG :
            return com.pingcap.tikv.types.IntegerType.readVarLong(cdi);
        default :
            throw new com.pingcap.tikv.codec.InvalidCodecFormatException(("Invalid Flag type for signed long type: " + (codecMap.get(flag))));
    }
}