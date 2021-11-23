private void notifyClear() {
    im.actor.runtime.mvvm.im.actor.runtime.Runtime.postToMainThread(() -> values.clear());
}