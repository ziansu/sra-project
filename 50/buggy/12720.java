@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.widget.Toast.makeText(this, ("Error in REST service: " + (t.getMessage())), Toast.LENGTH_LONG).show();
}