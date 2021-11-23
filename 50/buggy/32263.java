@java.lang.Override
public void onStop() {
    super.onStop();
    try {
        instituteDialog.dismiss();
        groupDialog.dismiss();
    } catch (java.lang.NullPointerException e) {
    }
}