public void clearCreateNewProjectError() {
    createNewProjectErrorMsg = null;
    if (!(showErrorMessage())) {
        loginDialog.clearErrorMessage();
    }
}