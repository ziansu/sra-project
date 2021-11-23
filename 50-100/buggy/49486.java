public void updateMaxPageNumber() {
    java.lang.Integer fullPage = (getResultSize()) / (getPageSize());
    boolean isLastPageFull = ((getResultSize()) % (getPageSize())) == 0;
    if ((!isLastPageFull) || (fullPage == 0))
        fullPage += 1;
    
    setMaxPageNumber(fullPage);
}