void loadLayout(com.xenoage.zong.core.format.LayoutFormat layoutFormat) {
    try {
        layoutSettings = com.xenoage.zong.io.musiclayout.LayoutSettingsReader.read(com.xenoage.utils.jse.JsePlatformUtils.jsePlatformUtils().openFile("data/layout/default.xml"));
        layoutDefaults = new com.xenoage.zong.layout.LayoutDefaults(layoutFormat, symbolPool, layoutSettings);
        symbolPool = com.xenoage.zong.util.ZongPlatformUtils.zongPlatformUtils().getSymbolPool();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}