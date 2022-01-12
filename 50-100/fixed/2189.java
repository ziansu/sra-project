private void processParsing() {
    keywordLinkQueue = crawlers.StockKeywordCrawler.getCrawlableLink();
    if ((keywordLinkQueue) == null) {
        return ;
    }
    parsingResult = getParsingResult();
    setCurrentLinkQueueStatusFinished();
    if ((parsingResult) instanceof services.EmptyParsingResult)
        return ;
    
    saveNewKeywordLinkQueues();
}