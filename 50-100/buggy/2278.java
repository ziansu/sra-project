public static void writeIntArray(int[] array, java.nio.ByteBuffer out) {
    if (array == null) {
        com.kylinolap.common.util.BytesUtil.writeVInt((-1), out);
        return ;
    }
    com.kylinolap.common.util.BytesUtil.writeVInt(array.length, out);
    out.asIntBuffer().put(array);
}