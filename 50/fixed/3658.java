public static boolean isEmpty(final java.lang.Object array) {
    return ((array == null) || (false == (com.xiaoleilu.hutool.util.ArrayUtil.isArray(array)))) || ((java.lang.reflect.Array.getLength(array)) == 0);
}