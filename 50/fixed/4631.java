@java.lang.Override
public void onError(com.quickblox.core.exception.QBResponseException e) {
    android.widget.Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
}