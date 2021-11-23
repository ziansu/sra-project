public static boolean isSuccess(java.lang.String in) {
    java.lang.System.out.println(in);
    if ((((in != null) && ((in.length()) != 0)) && ((in.indexOf("<Bal>")) != (-1))) && (in.substring(0, in.indexOf("<Bal>")).equals("yes"))) {
        return true;
    }
    return false;
}