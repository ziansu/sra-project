private boolean handleSinglePage(int pageNumber) {
    com.dmitring.yainterfaceliftdownloader.domain.ParsedPage parsedPage;
    boolean parsedUnsuccessfully;
    int attemptCount = 0;
    do {
        parsedPage = pageCrawler.getPagePictureInfo(pageNumber);
        parsedUnsuccessfully = parsedPage == null;
        attemptCount++;
    } while (parsedUnsuccessfully || (attemptCount < (maxAttemptCount)) );
    if (!parsedUnsuccessfully)
        parsedPage.getPictureInfo().forEach(newPictureFoundHandler::handleImage);
    
    return ((!parsedUnsuccessfully) && (newPictureFoundHandler.shouldContinue())) && (parsedPage.doesNextPageExist());
}