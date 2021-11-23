public void Refresh(EnumSiteTypes site, EnumCoinTypes type) {
    SiteApis[site.ordinal()].Refresh(type);
}