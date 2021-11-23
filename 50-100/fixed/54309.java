public static boolean searchForPhone(java.lang.String phone) {
    java.lang.CharSequence phoneN = phone;
    for (int i = 0; i < (MailReader.myMessages.size()); i++) {
        return MailReader.myMessages.get(i).contains(phone);
    }
    return false;
}