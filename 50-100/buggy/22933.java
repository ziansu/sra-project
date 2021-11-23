public void readContact() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
    startActivityForResult(intent, PICK_CONTACT);
    if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) && ((checkSelfPermission(Manifest.permission.READ_CONTACTS)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermissions(new java.lang.String[]{ Manifest.permission.READ_CONTACTS }, com.friendinneed.ua.friendinneed.SettingsActivity.PERMISSIONS_REQUEST_READ_CONTACTS);
    }
}