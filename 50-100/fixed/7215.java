@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((!(iconsPicker)) && (!(wallsPicker))) {
        setupToolbarHeader();
    }
    jahirfiquitiva.iconshowcase.utilities.color.ToolbarColorizer.setupToolbarIconsAndTextsColors(this, cAppBarLayout, cToolbar);
    runLicenseChecker(jahirfiquitiva.iconshowcase.activities.WITH_LICENSE_CHECKER, jahirfiquitiva.iconshowcase.activities.GOOGLE_PUBKEY, jahirfiquitiva.iconshowcase.activities.WITH_INSTALLED_FROM_AMAZON, jahirfiquitiva.iconshowcase.activities.ALLOW_APT_USE);
}