public java.util.List<com.atum.tunetube.youtube.YoutubeLink> parsePlaylist(java.lang.String url) {
    java.util.List<java.lang.String> content = com.atum.tunetube.youtube.YoutubeHttp.getSingleton().openUrl(url);
    java.util.List<com.atum.tunetube.youtube.YoutubeLink> links = new java.util.LinkedList<>();
    for (java.lang.String line : content) {
        if (line.contains("yt-lockup-title")) {
            com.atum.tunetube.youtube.YoutubeLink link = com.atum.tunetube.youtube.ParseYoutubeLink.parseHtml(line);
            links.add(link);
        }
    }
    return links;
}