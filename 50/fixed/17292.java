protected void onPostExecute(java.lang.Boolean result) {
    super.onPostExecute(result);
    internetConnectionAvailable = result;
    displayChannelSearchResults(getCurrentFocus());
}