public void Refresh(EnumSiteTypes site) {
    SiteApis[site.ordinal()].Refresh();
}