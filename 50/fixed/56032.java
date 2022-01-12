public static void removeMusicVisualizer() {
    if ((com.abs104a.mperwithsideproject.viewctl.ViewPagerForEqualizerViewCtl.mVisualizer) != null) {
        com.abs104a.mperwithsideproject.viewctl.ViewPagerForEqualizerViewCtl.mVisualizer.release();
        com.abs104a.mperwithsideproject.viewctl.ViewPagerForEqualizerViewCtl.mVisualizer = null;
        java.lang.System.gc();
    }
}