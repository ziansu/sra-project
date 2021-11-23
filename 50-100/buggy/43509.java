protected void onPostExecute(java.lang.String result) {
    int fixedCnt;
    if ((before) == 0)
        return ;
    
    isFixing = false;
    after = bank.getFrackedCoinsLength();
    fixedCnt = (before) - (after);
    if (fixedCnt < 0)
        fixedCnt = 0;
    
    java.lang.String msg = java.lang.String.format(getResources().getString(R.string.fixed), fixedCnt, before);
    showError(msg);
}