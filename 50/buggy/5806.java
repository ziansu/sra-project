void setQuoteText(java.lang.String quoteText) {
    mFullText = quoteText;
    mShortText = getFirstWordsAsString(mFullText, 10);
}