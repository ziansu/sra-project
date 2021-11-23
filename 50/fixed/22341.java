@java.lang.Override
protected void onPostExecute(java.lang.Integer integer) {
    super.onPostExecute(integer);
    setUpCurrentSequence();
    cancelPlayer();
    isSimonsTurn = true;
    playSimonSequence();
}