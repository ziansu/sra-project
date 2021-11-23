private void showImageMetadata(com.mcgluttons.imagemetadataeditor.Image image) {
    android.content.Intent showFormActivity = new android.content.Intent(getApplicationContext(), com.mcgluttons.imagemetadataeditor.FormActivity.class);
    java.util.ArrayList<com.mcgluttons.imagemetadataeditor.Image> imageToEdit = new java.util.ArrayList<com.mcgluttons.imagemetadataeditor.Image>();
    imageToEdit.add(image);
    showFormActivity.putParcelableArrayListExtra("IMAGE_DATA", imageToEdit);
    startActivityForResult(showFormActivity, 0);
}