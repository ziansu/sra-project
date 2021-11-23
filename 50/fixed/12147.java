@android.support.annotation.Nullable
android.app.Activity getCurrent() {
    try {
        return activityStack.peek();
    } catch (java.util.EmptyStackException e) {
        return null;
    }
}