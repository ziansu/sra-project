public void Refresh() {
    for (int indexSite = 0; indexSite < (SiteTypeAvailable); ++indexSite) {
        SiteApis[indexSite].Refresh();
    }
}