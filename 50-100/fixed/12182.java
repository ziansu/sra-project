@java.lang.Override
public void pop(com.reactnativenavigation.params.ScreenParams params) {
    getCurrentScreenStack().pop(params.animateScreenTransitions, new com.reactnativenavigation.screens.ScreenStack.OnScreenPop() {
        @java.lang.Override
        public void onScreenPopAnimationEnd() {
            setBottomTabsStyleFromCurrentScreen();
            EventBus.instance.post(new com.reactnativenavigation.events.ScreenChangedEvent(getCurrentScreenStack().peek().getScreenParams()));
        }
    });
}