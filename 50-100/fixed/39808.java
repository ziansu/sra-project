@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            mEventBus.post(new acr.browser.lightning.bus.BrowserEvents.OpenUrlInNewTab(url));
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            mHistoryDatabase.deleteHistoryItem(url);
            mEventBus.post(new acr.browser.lightning.bus.BrowserEvents.OpenHistoryInCurrentTab());
            break;
        case android.content.DialogInterface.BUTTON_NEUTRAL :
            mEventBus.post(new acr.browser.lightning.bus.BrowserEvents.OpenUrlInCurrentTab(url));
            break;
        default :
            break;
    }
}