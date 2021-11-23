@java.lang.Override
protected void onPostExecute(java.lang.Long result) {
    thisTaskListener.onChunkResultReady(chunkNumber, result);
}