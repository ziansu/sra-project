@java.lang.Override
public void onClick(android.view.View v) {
    this.startActivityForResult(android.content.Intent.createChooser(new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT).setType("image/*"), "Choose an image"), com.dreamfactory.sampleapp.activities.CreateContactActivity.CHOOSE_IMAGE_REQUEST);
}