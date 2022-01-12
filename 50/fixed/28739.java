@java.lang.Override
public boolean failure(int state, java.lang.String msg) {
    showToast(msg);
    beginCamcer();
    return super.failure(state, msg);
}