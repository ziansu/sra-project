private static org.raistlic.common.adt.BitMap buildBitMap(java.lang.String pattern) {
    pattern = pattern.replaceAll(" ", "");
    org.raistlic.common.adt.BitMap.Builder builder = org.raistlic.common.adt.BitMap.builder(pattern.length());
    for (int i = 0, len = pattern.length(); i < len; i++) {
        if ((pattern.charAt(i)) == '1') {
            builder.set(i);
        }
    }
    return builder.build();
}