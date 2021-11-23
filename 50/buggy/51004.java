@java.lang.Override
public com.reactnativenavigation.core.objects.Screen getCurrentScreen() {
    com.reactnativenavigation.core.objects.Screen currentScreen = super.getCurrentScreen();
    if (currentScreen != null) {
        return currentScreen;
    }
    return (mScreenStacks) != null ? mScreenStacks.get(mCurrentStackPosition).peek() : null;
}