@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case java_lang_programming.com.android_media_demo.ImageSelectionDemoActivity.REQUEST_CODE_CHOOSER :
            if (resultCode != (RESULT_OK)) {
                android.widget.Toast.makeText(this, getString(R.string.image_unselected_message), Toast.LENGTH_LONG).show();
                return ;
            }
            android.net.Uri result = data.getData();
            selectedImage.setImageURI(result);
            break;
        default :
            break;
    }
}