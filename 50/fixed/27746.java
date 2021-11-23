protected void onPostExecute(java.lang.Boolean result) {
    super.onPostExecute(result);
    internetConnectionAvailable = result;
    new net.computingtutor.robert.computingtutor.PlaylistGetter.PlaylistGet().execute(currentPlaylistId, apiKey, net.computingtutor.robert.computingtutor.PlaylistGetter.maxVideoResults);
}