public void loadBanner() {
    if (MainActivity.packageName.equals("com.lgallardo.qbittorrentclient")) {
        adView = ((com.google.android.gms.ads.AdView) (this.findViewById(R.id.adViewRssFeed)));
        com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}