@java.lang.Override
public void run() {
    android.content.Intent svc = new android.content.Intent(context, my.apps.demo.russianmediademo.customview.BackgroundSoundService.class);
    if (my.apps.demo.russianmediademo.customview.helper.Utils.isMyServiceRunning(my.apps.demo.russianmediademo.customview.BackgroundSoundService.class, context))
        context.stopService(svc);
    
    svc.putExtra("url", pi.Url());
    context.startService(svc);
}