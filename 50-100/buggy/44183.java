@java.lang.Override
protected void onProgressUpdate(java.lang.String... values) {
    super.onProgressUpdate(values);
    getDictionariesActivity.updateProgressBar(java.lang.Integer.parseInt(values[0]), java.lang.Integer.parseInt(values[1]));
    setTopTextWhileExtracting(values[2], values[3]);
}