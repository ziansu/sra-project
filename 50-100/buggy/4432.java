@java.lang.Override
public boolean showErrorMessage() {
    boolean hasMsg = super.showErrorMessage();
    if (hasMsg) {
        return true;
    }
    if (((createNewProjectErrorMsg) != null) && (!(createNewProjectErrorMsg.isEmpty()))) {
        loginDialog.setErrorMessage(createNewProjectErrorMsg);
        return true;
    }
    return false;
}