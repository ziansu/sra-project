@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getContext().getApplicationContext(), com.owncloud.android.utils.ErrorMessageAdapter.getErrorCauseMessage(result, null, getContext().getResources()), Toast.LENGTH_SHORT).show();
}