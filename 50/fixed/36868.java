@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(takePictureIntent, nl.hu.fed.actortemplateapp.activity.CreatePerson.TAKE_PHOTO);
}