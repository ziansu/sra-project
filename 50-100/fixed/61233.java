private void init() {
    android.content.SharedPreferences preference = getSharedPreferences("justcall", Context.MODE_PRIVATE);
    heartPos = preference.getInt("heart_pos", 0);
    android.util.Log.v("loadPos", java.lang.String.valueOf(heartPos));
    android.net.Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
    java.lang.String[] projection = new java.lang.String[]{ ContactsContract.CommonDataKinds.Phone._ID , ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME , ContactsContract.CommonDataKinds.Phone.DATA1 , "sort_key" , ContactsContract.CommonDataKinds.Phone.CONTACT_ID , ContactsContract.CommonDataKinds.Phone.PHOTO_ID , ContactsContract.CommonDataKinds.Phone.LOOKUP_KEY };
    asyncQueryHandler.startQuery(0, null, uri, projection, null, null, "sort_key COLLATE LOCALIZED asc");
}