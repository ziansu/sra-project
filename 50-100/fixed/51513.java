void loadLayout(com.xenoage.zong.core.format.LayoutFormat layoutFormat) {
    try {
        layoutSettings = com.xenoage.zong.io.musiclayout.LayoutSettingsReader.read(com.xenoage.utils.jse.JsePlatformUtils.jsePlatformUtils().openFile("data/layout/default.xml"));
        symbolPool = com.xenoage.zong.util.ZongPlatformUtils.zongPlatformUtils().getSymbolPool();
        layoutDefaults = new com.xenoage.zong.layout.LayoutDefaults(layoutFormat, symbolPool, layoutSettings);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}