private void setQuotes(int count) {
    mQuote1.setText(mQuotes[count]);
    mQuote2.setText(mQuotes[(count + 1)]);
    mQuote3.setText(mQuotes[(count + 2)]);
    mQuote4.setText(mQuotes[(count + 3)]);
    java.lang.String countDisplay = (count + "/") + (mQuotes.length);
    mQuoteCount.setText(countDisplay);
    animateViews();
}