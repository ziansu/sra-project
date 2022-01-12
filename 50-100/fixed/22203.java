@java.lang.Override
protected void onCancelled() {
    java.util.Date d = new java.util.Date();
    if ((call) != null) {
        android.util.Log.d("DEBUG", (((d.getTime()) + " Cancelled call at task ") + (apiTask.toString())));
        call.cancel();
    }
    super.onCancelled();
}