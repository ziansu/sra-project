public static void report() {
    jy.com.finalproject.Contact t = MainActivity.contacts.contacts.get(((MainActivity.contacts.contacts.size()) - 1));
    java.lang.String number = t.number;
    java.lang.String sms = t.text;
    java.lang.System.out.println("3) Send text without a location.");
    jy.com.finalproject.Texting.sendMsg(number, sms);
}