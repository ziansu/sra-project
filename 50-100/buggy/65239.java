public void calculateStatistics() {
    loadFromFile();
    displayStatistics = ((android.widget.TextView) (findViewById(R.id.statistics_text)));
    displayStatistics.setMovementMethod(new android.text.method.ScrollingMovementMethod());
    sCal.calAll();
    displayStatistics.setText(sCal.getStatString());
    sLFiles.saveInAllFile(this);
}