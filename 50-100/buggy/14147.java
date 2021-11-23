@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case com.mycompany.neighbors.Fragments.NewsFeedFragment.MY_PERMISSIONS_REQUEST_FINE_LOCATION :
            if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                permissionIsGranted = true;
            }else {
                permissionIsGranted = false;
                android.widget.Toast.makeText(getContext(), "This app requires location permissions", Toast.LENGTH_SHORT).show();
            }
            break;
    }
}