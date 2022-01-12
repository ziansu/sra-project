@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.localytics.android.itracker.ui.PhotoFragment.REQUEST_TAKE_PHOTO)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        galleryAddPhoto();
    }
}