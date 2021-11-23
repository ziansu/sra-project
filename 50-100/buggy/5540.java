public static int[] readIntArray(java.nio.ByteBuffer in) {
    int len = com.kylinolap.common.util.BytesUtil.readVInt(in);
    if (len < 0)
        return null;
    
    int[] array = new int[len];
    in.asIntBuffer().get(array);
    return array;
}