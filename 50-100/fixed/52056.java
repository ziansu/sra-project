@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            eventBus.post(new acr.browser.lightning.bus.BrowserEvents.OpenUrlInNewTab(url));
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            eventBus.post(new acr.browser.lightning.bus.BrowserEvents.OpenUrlInCurrentTab(url));
            break;
        case android.content.DialogInterface.BUTTON_NEUTRAL :
            acr.browser.lightning.utils.Utils.downloadFile(activity, url, userAgent, "attachment");
            break;
    }
}