protected static java.util.ArrayList<java.lang.String> getImageUrlsFromThumbnailUrl(java.lang.String thumbnailUrl) {
    java.util.ArrayList<java.lang.String> allImageUrls = new java.util.ArrayList<java.lang.String>();
    java.util.ArrayList<java.lang.String> thumbnailUrls = MangaDownloader.getAllThumbnailPages(thumbnailUrl);
    java.lang.System.out.println(" ---- ");
    for (java.lang.String url : thumbnailUrls) {
        java.lang.System.out.println((" thumbnail page = " + url));
        java.util.ArrayList<java.lang.String> imageUrls = MangaDownloader.getImageUrlsFromThumbnailUrlPerPage(url);
        allImageUrls.addAll(imageUrls);
    }
    java.lang.System.out.println(" ---- ");
    return allImageUrls;
}