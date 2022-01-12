private void run() {
    java.lang.String filename = "stations.txt";
    reader = new java.io.Reader(filename);
    reader.read();
    Podcasts podcasts = reader.getPodcasts();
    Station station = podcasts.get("nrk1");
    java.lang.String urlen = station.get("dagsnytt");
    XMLParser xmlParser = new XMLParser(urlen);
    java.lang.String[] mp3 = xmlParser.getMp3();
    this.downloader = new Downloader();
    downloader.downloadPodcast(mp3[0]);
}