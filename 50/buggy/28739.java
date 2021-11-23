@java.lang.Override
public boolean failure(int state, java.lang.String msg) {
    beginCamcer();
    showToast(msg);
    return super.failure(state, msg);
}