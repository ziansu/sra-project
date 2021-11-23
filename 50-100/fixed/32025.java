public static void search(java.util.TreeMap<java.lang.String, ImageFile> images, ImageFile queryImage) {
    double[] targetHist = queryImage.m_colorHistogram;
    for (java.util.Map.Entry<java.lang.String, ImageFile> entry : images.entrySet()) {
        ImageFile currImage = entry.getValue();
        double[] currHist = currImage.m_colorHistogram;
        currImage.m_score = ColorHist.computeSimilarity(targetHist, currHist);
    }
    return ;
}