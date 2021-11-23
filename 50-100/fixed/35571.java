public static void loadWidgetRelatedSettings(android.content.Context context) {
    if (br.com.carlosrafaelgn.fplay.ui.UI.fullyInitialized)
        return ;
    
    final br.com.carlosrafaelgn.fplay.util.SerializableMap opts = br.com.carlosrafaelgn.fplay.playback.Player.loadConfigFromFile(context);
    br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, null, opts.getInt(30, br.com.carlosrafaelgn.fplay.ui.UI.LOCALE_NONE), false);
    br.com.carlosrafaelgn.fplay.ui.UI.widgetTransparentBg = opts.getBit(18);
    br.com.carlosrafaelgn.fplay.ui.UI.widgetTextColor = opts.getInt(35, -16777216);
    br.com.carlosrafaelgn.fplay.ui.UI.widgetIconColor = opts.getInt(36, -16777216);
}