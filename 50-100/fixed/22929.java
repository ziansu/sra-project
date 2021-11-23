@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (com.selfscore.selfscoreapp.Activities.DashboardActivities.UpdateInfoActivity.GET_FROM_GALLERY)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        android.net.Uri selectedImage = data.getData();
        try {
            bitmap = decodeUri(selectedImage);
            fixOrientation(bitmap, selectedImage);
            userphoto.setImageBitmap(bitmap);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}