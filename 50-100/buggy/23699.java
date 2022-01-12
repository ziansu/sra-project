@java.lang.Override
public void run() {
    android.app.Activity context = view.getContextActivity();
    android.content.Intent intent = new android.content.Intent(context, org.dimamir999.testapp.services.LocationControlService.class);
    android.app.PendingIntent pendingIntent = context.createPendingResult(0, new android.content.Intent(), 0);
    intent.putExtra(org.dimamir999.testapp.activities.presenters.ListPhotosPresenter.PENDING_INTENT_CODE, pendingIntent);
    context.startService(intent);
    android.util.Log.v("dimair999", "start service from map activity");
}