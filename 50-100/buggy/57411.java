private void onDataFinished() {
    if ((de.conradowatz.jkgvertretung.tools.VertretungsData.getInstance().getTagList().size()) > 0) {
        android.content.Intent backToMain = new android.content.Intent();
        backToMain.putExtra("ExitCode", "LoadingDone");
        setResult(de.conradowatz.jkgvertretung.activities.RESULT_OK, backToMain);
        finish();
    }else {
        onNoAccess();
    }
}