@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if (requestCode == 0) {
        if ((((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) && ((grantResults[1]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            com.codecool.arinyu.myfirstandroidapp.take_picture.TakingPicture takingPicture = new com.codecool.arinyu.myfirstandroidapp.take_picture.TakingPicture();
            takingPicture.takeFilePhoto();
        }
    }
}