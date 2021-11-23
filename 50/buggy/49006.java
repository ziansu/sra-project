private void updatePageInfo() {
    updatePageInfo(quranPageFeeder.getCurrentPagePosition());
    com.quran.labs.androidquran.util.QuranSettings.getInstance().setLastPage(quranPageFeeder.getCurrentPagePosition());
}