private void loadPage() {
    try {
        comicPage = org.jsoup.Jsoup.connect(((comicData.baseUrl) + (comicCount))).get();
        com.orhanobut.logger.Logger.d(comicPage.toString());
    } catch (java.io.IOException e) {
    }
}