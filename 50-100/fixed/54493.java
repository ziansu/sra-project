@java.lang.Override
public void onClick(android.view.View p1) {
    int id = (p1.getId()) - ((appCount) + (NO_PAGE));
    com.guyz.glauncherbeta.Intent i = manager.getLaunchIntentForPackage(apps.get(id).name.toString());
    startActivity(i);
}