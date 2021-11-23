public static com.github.huangzhiyi.shpmdir.CitySet ofBinStr(java.lang.String bin) {
    com.github.huangzhiyi.shpmdir.CitySet cs = com.github.huangzhiyi.shpmdir.CitySet.emptySet();
    if (bin != null) {
        char[] ca = bin.toCharArray();
        int size = java.lang.Math.min(cs.end, bin.length());
        for (int i = 0; i < size; i++) {
            if ((ca[i]) == '1') {
                cs.bs.set((i + 1));
            }
        }
    }
    return cs;
}