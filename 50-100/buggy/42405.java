public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.v(jycprogrammer.ultimatedbz.ezlapse.LapseGridActivity.TAG, "onActivityResult");
    if (resultCode != (android.app.Activity.RESULT_OK))
        return ;
    
    if (requestCode == (jycprogrammer.ultimatedbz.ezlapse.LapseGridActivity.REQUEST_PHOTO)) {
        if (((java.lang.Boolean) (data.getBooleanExtra(FullscreenCamera.EXTRA_PASS, false))))
            updateView();
        
    }
}