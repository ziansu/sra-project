@java.lang.Override
public float generatorSortValue(org.apache.hadoop.io.Text url, org.apache.nutch.crawl.CrawlDatum datum, float initSort) throws org.apache.nutch.scoring.ScoringFilterException {
    return datum.getScore();
}