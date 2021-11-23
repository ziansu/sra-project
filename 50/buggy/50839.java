@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent getIntent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    getIntent.setType("image/*");
    android.content.Intent pickIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    pickIntent.setType("image/*");
    startActivityForResult(pickIntent, nl.hu.fed.actortemplateapp.activity.CreatePerson.SELECT_PHOTO);
}