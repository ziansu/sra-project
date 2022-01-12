@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())) {
        int level = intent.getIntExtra("level", 0);
        int scale = intent.getIntExtra("scale", 100);
        curPower = ((level * 100) / scale) / 25;
        if (!(hideflag)) {
            touchBtn.setText(momodupi.alandkaomoji.RealService.btykao_expd[curPower]);
        }else {
            touchBtn.setText(momodupi.alandkaomoji.RealService.btykao_hide[curPower]);
        }
    }
}