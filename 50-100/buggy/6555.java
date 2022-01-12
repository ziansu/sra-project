@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode != (EditFragment.REQUEST_TAKE_PHOTO)) || (resultCode != (android.app.Activity.RESULT_OK)))
        return ;
    
    com.example.jbt.omdb.EditFragment editFrag = mFragmentHelper.getEditFragmentIfExists();
    if (editFrag != null)
        editFrag.onCameraActivityResult();
    
}