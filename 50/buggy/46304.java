@java.lang.Override
public void onFailure(java.lang.Exception error) {
    com.enhueco.model.other.Utilities.showErrorToast(getApplicationContext());
    dialog.dismiss();
}