public void cacheCookies(java.lang.String url, java.lang.String location) {
    params.add("--save-cookies");
    params.add((location + "/cookies"));
    params.add("--keep-session-cookies");
    params.add("--delete-after");
    params.add(url);
    try {
        startDownloader().waitFor();
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    clearParams();
}