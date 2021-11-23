@java.lang.Override
protected void show(java.lang.String text) {
    com.williammora.snackbar.Snackbar.with(activity.getApplicationContext()).text(text).show(activity);
}