public void morphFromFab(android.view.View fab, long showSheetDuration, long showSheetColorDuration, com.gordonwong.materialsheetfab.animations.AnimationListener listener) {
    sheet.setVisibility(View.VISIBLE);
    revealSheetWithFab(fab, getFabRevealRadius(fab), getSheetRevealRadius(), showSheetDuration, fabColor, sheetColor, showSheetColorDuration, listener);
}