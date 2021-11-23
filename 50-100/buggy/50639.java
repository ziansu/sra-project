private void extractNgramsFromURL() {
    for (int k = org.commoncrawl.mklab.ngrams.NGramAnalyzer.START; k < (org.commoncrawl.mklab.ngrams.NGramAnalyzer.END); k += org.commoncrawl.mklab.ngrams.NGramAnalyzer.STEP) {
        java.util.List<org.commoncrawl.mklab.analysis.CrawledImage> list = dao.findRange(k, org.commoncrawl.mklab.ngrams.NGramAnalyzer.STEP);
        for (org.commoncrawl.mklab.analysis.CrawledImage i : list) {
            org.commoncrawl.mklab.ngrams.NGramAnalyzer.processURL(i.normalizedSrc);
        }
    }
}