@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case us.asimgasimzade.android.neatwallpapers.SingleImageFragment.MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    android.widget.Toast.makeText(getActivity().getApplicationContext(), R.string.permission_granted_message, Toast.LENGTH_SHORT).show();
                    downloadImage();
                }else {
                }
            }
    }
}