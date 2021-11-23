private void goToRibbons() {
    updateDatabaseWithRibbon();
    android.content.Intent ribbonIntent = new android.content.Intent(getApplicationContext(), com.lerenard.bible.RibbonActivity.class);
    startActivityForResult(ribbonIntent, com.lerenard.bible.ReadingActivity.SELECT_RIBBON_CODE);
}