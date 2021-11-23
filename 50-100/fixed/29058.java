private void fabClicked() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getBaseCallNoteActivity(), android.Manifest.permission.READ_CALL_LOG)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(getBaseCallNoteActivity(), new java.lang.String[]{ android.Manifest.permission.READ_CALL_LOG }, Constants.MY_PERMISSIONS_REQUEST_READ_CALL_LOG_FAB);
        fabClicked();
    }else {
        getBaseCallNoteActivity().switchFragment(new com.rohan.callnote.fragments.CallLogFragment(), true, com.rohan.callnote.fragments.CallLogFragment.class.getSimpleName());
    }
}