@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if (requestCode == (im.dino.dbinspector.fragments.TableListFragment.REQUEST_PERMISSION_CODE)) {
        if (Manifest.permission.WRITE_EXTERNAL_STORAGE.equals(permissions[0])) {
            if ((android.content.pm.PackageManager.PERMISSION_GRANTED) == (grantResults[0])) {
                im.dino.dbinspector.services.CopyDbIntentService.startService(getActivity(), database);
            }else {
                android.widget.Toast.makeText(getContext(), getString(R.string.dbinspector_permission_denied), Toast.LENGTH_SHORT).show();
            }
        }
    }
}