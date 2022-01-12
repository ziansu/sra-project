private void processParsing() {
    keywordLinkQueue = crawlers.StockKeywordCrawler.getCrawlableLink();
    if ((keywordLinkQueue) == null) {
        return ;
    }
    parsingResult = getParsingResult();
    if ((parsingResult) instanceof services.EmptyParsingResult)
        return ;
    
    setCurrentLinkQueueStatusFinished();
    saveNewKeywordLinkQueues();
}