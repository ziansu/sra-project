@java.lang.Override
void remove() {
    if (isDisplayed) {
        sendDeleteCommand();
    }
    mSdlContext.unregisterButtonCallback(mId);
}