@java.lang.Override
public void onSaveAndProceedButtonClicked() {
    if (validateData()) {
        sendDataToServer();
    }
}