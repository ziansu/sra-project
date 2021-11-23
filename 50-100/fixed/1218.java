@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
        se.gsc.stenmark.gscenduro.MainActivity.disconected = true;
    } catch (java.lang.Exception e1) {
        se.gsc.stenmark.gscenduro.PopupMessage dialog = new se.gsc.stenmark.gscenduro.PopupMessage(se.gsc.stenmark.gscenduro.MainActivity.generateErrorMessage(e1));
        dialog.show(getSupportFragmentManager(), "popUp");
    }
}