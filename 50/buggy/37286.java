@java.lang.Override
public void onFailure(retrofit2.Call<in.tosc.doandroidlib.objects.Action> call, java.lang.Throwable t) {
    setSwitchWithoutTriggering(switchBackup, true);
    android.support.design.widget.Snackbar.make(coordinatorLayout, getString(R.string.network_error), Snackbar.LENGTH_SHORT).show();
}