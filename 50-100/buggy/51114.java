@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (edu.ucsb.cs.cs185.npoon.mydog.PetPostFragment.REQ_CODE_CHOOSE_PICTURE)) || ((requestCode == (edu.ucsb.cs.cs185.npoon.mydog.PetPostFragment.CAMERA_REQUEST)) && (resultCode == (android.app.Activity.RESULT_OK)))) {
        android.net.Uri uri = data.getData();
        petImg.setImageURI(uri);
        petImg.setTag(uri);
    }
}