private void updateUI_2_Dashboard() {
    final boolean isBrowserAvailable = (_browser) != null;
    _dashboard_PageBook.showPage((isBrowserAvailable ? _dashboardPage_WithBrowser : _dashboardPage_NoBrowser));
    if (!isBrowserAvailable) {
        return ;
    }
    final java.lang.String html = createHTML();
    _isBrowserCompleted = false;
    _browser.setText(html);
}