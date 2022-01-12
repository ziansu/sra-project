@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(me.ryanmiles.mysummoner.events.ExceptionHandle e) {
    timber.log.Timber.i(java.lang.String.valueOf(e));
    android.widget.Toast.makeText(this, e.getErrorString(), Toast.LENGTH_LONG).show();
}