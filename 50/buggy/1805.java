@java.lang.Override
public void run() {
    menuProcessor.processActivity(activity);
    android.view.View view = activity.getWindow().getDecorView();
    processView(view);
}