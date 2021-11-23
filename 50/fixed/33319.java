public void onClick(android.view.View v) {
    if ((features.backButtonCanClose) && (canGoBack())) {
        closeDialog();
    }else {
        goBack();
    }
}