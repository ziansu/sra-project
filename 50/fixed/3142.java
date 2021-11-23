private void updateCoordinates() {
    final cgeo.geocaching.ui.dialog.CoordinatesInputDialog coordsDialog = cgeo.geocaching.ui.dialog.CoordinatesInputDialog.getInstance(null, null);
    coordsDialog.setCancelable(true);
    coordsDialog.show(getSupportFragmentManager(), "wpedit_dialog");
}