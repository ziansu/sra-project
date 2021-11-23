public void onBackPressed() {
    if ((this.themeableBrowser) == null) {
        this.dismiss();
    }else {
        if ((this.hardwareBack) && (this.themeableBrowser.canGoBack())) {
            this.themeableBrowser.goBack();
        }else {
            this.themeableBrowser.closeDialog();
        }
    }
}