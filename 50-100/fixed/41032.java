public static void main(java.lang.String[] args) {
    song.Song song;
    try {
        song = util.Searcher.searchMusic("Hello").get(0);
        util.URLFetcher.fetch(song);
        java.lang.System.out.println(song);
        downloader.Downloader.download(song);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}