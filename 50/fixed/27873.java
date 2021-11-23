public static void clear() {
    if ((com.baiiu.tsnackbar.LUtils.instance) != null) {
        com.baiiu.tsnackbar.LUtils.instance.mActivity = null;
        com.baiiu.tsnackbar.LUtils.instance = null;
    }
}