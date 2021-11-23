public boolean checkPhoneNo(java.lang.String No) {
    boolean flag = true;
    for (char ch : com.example.vishnu.contacts.Main2Activity.blockedCharacterSet.toCharArray()) {
        if (No.contains(("" + ch))) {
            flag = false;
            return flag;
        }
    }
    return flag;
}