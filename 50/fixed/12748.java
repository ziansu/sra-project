public void clickMbtilesPositiveButton() {
    if ((mbtilesDialog) != null) {
        mbtilesDialog.getButton(DialogInterface.BUTTON_POSITIVE).performClick();
    }else {
        android.util.Log.w("MapActivity", "The mbtiles dialog is either null or not showing, cannot perform positive click");
    }
}