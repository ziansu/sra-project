public boolean checkPhoneNo(java.lang.String No) {
    boolean flag = true;
    for (char ch : com.example.vishnu.contacts.Main2Activity.blockedCharacterSet.toCharArray()) {
        if (No.contains(("" + ch))) {
            android.util.Log.d(com.example.vishnu.contacts.Main2Activity.LOG_TAG, ("Number contains: " + ch));
            flag = false;
            return flag;
        }
    }
    return flag;
}