public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (((requestCode == (kis.agh.edu.pl.childrensupervisiorandroid.TaskItemFragment.CAMERA_REQUEST)) && (data != null)) && ((data.getExtras()) != null)) {
        android.graphics.Bitmap photo = ((android.graphics.Bitmap) (data.getExtras().get("data")));
        addPhotoToView(photo);
        savePhotoToDatabase(photo);
    }
}