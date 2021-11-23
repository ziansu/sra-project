@butterknife.OnClick(value = R.id.captureimage)
void take_photo() {
    f = dispatchTakePictureIntent();
}