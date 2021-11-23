public com.reactnativenavigation.core.objects.Screen pop() {
    com.reactnativenavigation.core.objects.Screen popped = mScreenStack.pop();
    if (mScreenStack.isEmpty()) {
        dismiss();
    }
    return popped;
}