static void syncOpenUrlWhenUninstall(java.lang.String dirStr, java.lang.String openUrl) {
    cn.hiroz.uninstallfeedback.FeedbackUtils.init(0, dirStr, "com.android.browser/com.android.browser.BrowserActivity", "android.intent.action.VIEW", openUrl, Build.BRAND);
}