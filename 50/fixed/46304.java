@java.lang.Override
public void onFailure(java.lang.Exception error) {
    dialog.dismiss();
    com.enhueco.model.other.Utilities.showErrorToast(getApplicationContext());
}