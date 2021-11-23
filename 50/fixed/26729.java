public static java.lang.Integer getConfigInt(java.lang.String path) {
    int ret;
    ret = java.lang.Integer.parseInt(Main.tntspleefcfg.getString(path));
    return ret;
}