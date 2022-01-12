@java.lang.Override
public void onDisabled(com.iazasoft.footguy.Context context) {
    super.onDisabled(context);
    sleep(context);
    com.iazasoft.footguy.Intent i0 = new com.iazasoft.footguy.Intent(context, com.iazasoft.footguy.ScreenListenerService.class);
    com.iazasoft.footguy.Footguy.mContext.stopService(i0);
}