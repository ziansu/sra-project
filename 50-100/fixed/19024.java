public java.util.List<com.laudandjolynn.mytv.model.ProgramTable> crawlAllProgramTable(java.lang.String date) {
    java.util.List<com.laudandjolynn.mytv.model.ProgramTable> ptList = com.laudandjolynn.mytv.crawler.CrawlerManager.getInstance().getCrawler().crawlAllProgramTable(date);
    com.laudandjolynn.mytv.model.ProgramTable[] ptArray = new com.laudandjolynn.mytv.model.ProgramTable[ptList.size()];
    save(ptList.toArray(ptArray));
    return ptList;
}