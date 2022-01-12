@java.lang.Override
public void createContent(org.chromium.chrome.browser.infobar.InfoBarLayout layout) {
    super.createContent(layout);
    layout.setIsUsingBigIcon();
    layout.setMessage(mData.getAppName());
    layout.getMessageLayout().addDescription(org.chromium.components.url_formatter.UrlFormatter.formatUrlForSecurityDisplay(mData.getUrl(), false));
    layout.getPrimaryButton().setText(R.string.instant_apps_open_in_app);
    layout.getPrimaryButton().setButtonColor(org.chromium.base.ApiCompatibilityUtils.getColor(getContext().getResources(), R.color.app_banner_install_button_bg));
}