@java.lang.Override
public void onSuccess(java.lang.Void info) {
    getState().topic = topic;
    super.onSuccess(info);
}