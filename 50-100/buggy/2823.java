public void onBackPressed() {
    if ((this.themeableBrowser) == null) {
        this.dismiss();
    }else {
        if ((this.hardwareBack) && (this.inAppBrowser.canGoBack())) {
            this.inAppBrowser.goBack();
        }else {
            this.inAppBrowser.closeDialog();
        }
    }
}