@java.lang.Override
public void onFailure() {
    welcomeScreenView.showError("Failed");
    welcomeScreenView.showProgressBar(false);
}