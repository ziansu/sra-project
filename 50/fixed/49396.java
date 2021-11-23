@java.lang.Override
void remove() {
    if (isDisplayed) {
        isDisplayed = false;
        sendDeleteCommand();
    }
    mSdlContext.unregisterButtonCallback(mId);
}