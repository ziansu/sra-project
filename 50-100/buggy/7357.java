protected void setBannerVisible() {
    com.kiroule.jpetstore.vaadinspring.domain.Account account = com.kiroule.jpetstore.vaadinspring.ui.util.CurrentAccount.get();
    if (((account != null) && (account.isBannerOption())) && (!(com.google.common.base.Strings.isNullOrEmpty(account.getBannerName())))) {
        bannerImage.setValue(account.getBannerName());
        bannerLayout.setVisible(true);
        bannerLayout.setStyleName(getBannerStyleName(account.getBannerName()));
    }
}