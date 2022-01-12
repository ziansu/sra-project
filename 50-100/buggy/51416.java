private org.jsoup.select.Elements getJobBlocksForRabotaUa(org.jsoup.nodes.Document doc, java.lang.String[] jobBox) {
    org.jsoup.select.Elements jobBlocks = new org.jsoup.select.Elements();
    for (int i = 1; i < (jobBox.length); i++) {
        org.jsoup.select.Elements jobElements = doc.getElementsByAttributeValue(jobBox[0], jobBox[i]);
        if (!(jobElements.isEmpty())) {
            jobBlocks.addAll(jobElements);
        }
    }
    return jobBlocks;
}