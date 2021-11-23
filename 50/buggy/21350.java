@java.lang.Override
public void onSaveAndProceedButtonClicked() {
    if (validateData()) {
        educationalView.openNextScreen();
        sendDataToServer();
    }
}