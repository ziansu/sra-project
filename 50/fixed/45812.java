@java.lang.Override
public void onResume() {
    super.onResume();
    if (forceUpdate) {
        loadItens();
        updateDataFromServer();
    }else {
        loadItens();
        forceUpdate = false;
    }
    verifyEmailStatus();
}