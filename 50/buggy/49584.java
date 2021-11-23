public void play(java.lang.String url) {
    if (url != null) {
        this.url = url;
        play(url, 0);
    }
}