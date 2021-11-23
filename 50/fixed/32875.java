@java.lang.Override
protected void onPostExecute(com.crossbowffs.quotelock.api.QuoteData quote) {
    super.onPostExecute(quote);
    jobFinished(mJobParameters, false);
    mUpdaterTask = null;
}