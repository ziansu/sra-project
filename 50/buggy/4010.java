public com.reactnativenavigation.core.objects.Screen pop() {
    com.reactnativenavigation.core.objects.Screen popped = mScreenStack.pop();
    if (mScreenStack.isEmpty()) {
        com.reactnativenavigation.controllers.ModalController.getInstance().remove();
        dismiss();
    }
    return popped;
}