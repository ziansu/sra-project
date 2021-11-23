@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.hasExtra(org.md2k.study.ActivityMain.EXIT)) {
        try {
            ServiceSystemHealth.RANK_LIMIT = Status.RANK_ADMIN_OPTIONAL;
            org.md2k.study.controller.ModelManager.getInstance(this).clear();
            org.md2k.study.controller.ModelManager.getInstance(this).read();
            org.md2k.study.controller.ModelManager.getInstance(this).set();
            finish();
        } catch (org.md2k.datakitapi.exception.DataKitException e) {
            e.printStackTrace();
        }
    }else {
        updateMenu();
    }
}