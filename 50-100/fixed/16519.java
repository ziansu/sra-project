public static void main(java.lang.String[] args) throws java.lang.Exception {
    FlashChemLit.GetCache();
    FlashChemLit.CheckFolder();
    FlashChemLit.GetUrls();
    FlashChemLit.putCrawlerToWork();
    FlashChemLit.createIndex();
    FlashChemLit.deleteOutdateIndex();
}