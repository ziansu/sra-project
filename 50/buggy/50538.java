public static <K, V> java.lang.String formatSimpleMap(java.util.Map<K, V> inputMap) {
    java.lang.Class<?> allowClassTypes = null;
    return null == inputMap ? org.apache.commons.lang3.StringUtils.EMPTY : com.feilong.tools.jsonlib.JsonUtil.formatSimpleMap(inputMap, allowClassTypes);
}