protected void onPostExecute(java.lang.Boolean result) {
    super.onPostExecute(result);
    progressBarGenerator.removeProgressBar();
    internetConnectionAvailable = result;
    displayChannelSearchResults(getCurrentFocus());
}