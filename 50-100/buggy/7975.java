@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == (me.esca.fragments.CookFragment.REQUEST_EXTERNAL_STORAGE)) {
        if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
            photoPickerIntent.setType("image/*");
            startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
        }else {
            android.widget.Toast.makeText(getActivity(), "PERMISSION_DENIED", Toast.LENGTH_SHORT).show();
        }
    }
}