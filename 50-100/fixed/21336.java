private static android.net.Uri[] transformDataUri(com.meyerlaurent.cactv.AutoCompleteContactTextView.TYPE_OF_DATA data) {
    switch (data) {
        case PHONE :
            android.net.Uri[] phone = new android.net.Uri[]{ ContactsContract.CommonDataKinds.Phone.CONTENT_URI };
            return phone;
        case EMAIL :
            android.net.Uri[] email = new android.net.Uri[]{ ContactsContract.CommonDataKinds.Email.CONTENT_URI };
            return email;
        case BOTH :
            android.net.Uri[] both = new android.net.Uri[]{ ContactsContract.CommonDataKinds.Phone.CONTENT_URI , ContactsContract.CommonDataKinds.Email.CONTENT_URI };
            return both;
        default :
            android.net.Uri[] defaultArray = new android.net.Uri[]{ ContactsContract.CommonDataKinds.Phone.CONTENT_URI };
            return defaultArray;
    }
}