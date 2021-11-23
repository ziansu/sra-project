@android.support.annotation.Nullable
android.app.Activity getCurrent() {
    try {
        return activityStack.peek().get();
    } catch (java.util.EmptyStackException e) {
        return null;
    }
}