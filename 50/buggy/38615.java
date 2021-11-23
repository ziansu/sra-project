public void downloadImages(jig.bing.search.ImageResponse response) {
    jig.bing.ImageDownloader imageDownloader = new jig.bing.ImageDownloader();
    imageDownloader.saveImages(response.getResults());
}