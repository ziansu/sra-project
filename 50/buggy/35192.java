@java.lang.Override
public void onFailure(java.lang.String error) {
    welcomeScreenView.showError("Failed");
    welcomeScreenView.showProgressBar(false);
}