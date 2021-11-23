public static boolean checkPhoneNumber() {
    return !(net.sf.memoranda.util.Configuration.get("PHONE_NUMBER").equals("invalid"));
}