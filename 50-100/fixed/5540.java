public static int[] readIntArray(java.nio.ByteBuffer in) {
    int len = com.kylinolap.common.util.BytesUtil.readVInt(in);
    if (len < 0)
        return null;
    
    int[] array = new int[len];
    for (int i = 0; i < len; ++i) {
        array[i] = com.kylinolap.common.util.BytesUtil.readVInt(in);
    }
    return array;
}