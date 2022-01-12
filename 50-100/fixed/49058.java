private java.lang.String doGetDownloadLink(java.lang.String imageName, java.util.List<java.lang.String> possibleStations) {
    java.lang.String link = null;
    for (java.lang.String station : possibleStations) {
        java.lang.String imageNameConcat = imageName.concat(station);
        link = usgsDownloadURL(getDataSet(imageNameConcat), imageNameConcat, org.fogbowcloud.sebal.engine.sebal.USGSNasaRepository.EARTH_EXPLORER_NODE, org.fogbowcloud.sebal.engine.sebal.USGSNasaRepository.LEVEL_1_PRODUCT);
        if ((link != null) && (!(link.isEmpty()))) {
            imageName = imageNameConcat;
            return link;
        }
    }
    return null;
}