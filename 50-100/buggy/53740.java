public void checkAppState() {
    if (((isStateInvalid()) && ((mTaskProcessCallback) != null)) && ((mTaskProcessCallback.get()) != null)) {
        com.rokid.cloudappclient.util.Logger.d((("form: " + (getFormType())) + " voice stop , allTaskFinished ! finish app !"));
        mTaskProcessCallback.get().onAllTaskFinished();
    }
}