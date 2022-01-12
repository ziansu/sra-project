public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        if (((requestCode == (ru.vladimirmi.skbshop.utils.Constants.REQUEST_GALLERY)) && (data != null)) && ((data.getData()) != null)) {
            mCurrentPhotoUri = data.getData().toString();
        }
        mViewModel.avatar.set(mCurrentPhotoUri);
    }
}