@java.lang.Override
public void showCloseDialog(final int position) {
    if (position < 0) {
        return ;
    }
    acr.browser.lightning.dialog.BrowserDialog.show(this, R.string.dialog_title_close_browser, new acr.browser.lightning.dialog.BrowserDialog.Item(R.string.close_tab) {
        @java.lang.Override
        public void onClick() {
            mPresenter.deleteTab(position);
        }
    }, new acr.browser.lightning.dialog.BrowserDialog.Item(R.string.close_other_tabs) {
        @java.lang.Override
        public void onClick() {
            mPresenter.closeAllOtherTabs();
        }
    }, new acr.browser.lightning.dialog.BrowserDialog.Item(R.string.close_all_tabs) {
        @java.lang.Override
        public void onClick() {
            closeBrowser();
        }
    });
}