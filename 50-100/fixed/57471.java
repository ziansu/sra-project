boolean handlesPop(com.jaynewstrom.screenswitcher.Screen screen) {
    com.jaynewstrom.screenswitcher.ScreenPopListener popListener = popListenerMap.get(screen);
    boolean handlesPop = (popListener != null) && (popListener.onScreenPop(screen));
    if (!handlesPop) {
        popListenerMap.remove(screen);
    }
    return handlesPop;
}