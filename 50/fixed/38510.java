@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (EditFragment.REQUEST_TAKE_PHOTO))
        mEditFrag.onCameraActivityResult(resultCode);
    
}