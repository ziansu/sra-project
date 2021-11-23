@java.lang.Override
public void onSubmitButtonClick() {
    if (validateData()) {
        sendFinanceDataToServer();
    }
}