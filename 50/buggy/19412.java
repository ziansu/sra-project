boolean isPanicTrigger(android.content.Intent intent) {
    return (intent != null) && (acr.browser.lightning.activity.BrowserActivity.INTENT_PANIC_TRIGGER.equals(intent.getAction()));
}