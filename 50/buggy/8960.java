@java.lang.Override
public void onDestroy() {
    updateUI(Constants.UI.BUTTON, null);
    super.onDestroy();
}