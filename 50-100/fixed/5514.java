@butterknife.OnClick(value = R.id.edit_cover_image_button)
public void onSelectImageClick() {
    if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) && ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, io.github.nfdz.foco.ui.dialogs.EditDocCoverDialog.ImageFragment.PERMISSION_REQUEST_CODE);
    }else {
        openFilePickerDialog();
    }
}