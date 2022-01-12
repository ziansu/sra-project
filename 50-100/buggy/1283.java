private java.lang.String parseCode(android.content.Intent data) {
    android.net.Uri uri = data.getData();
    if ((uri != null) && (uri.toString().startsWith(SocialVariable.MERVID_CALLBACK))) {
        java.lang.String code = uri.getQueryParameter("code");
        if ((code != null) && (!("".equalsIgnoreCase(code)))) {
            android.util.Log.d("Intruder", code);
            return code;
        }
    }
    return "null";
}