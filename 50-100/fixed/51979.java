public static boolean checkStatusAndReturnLogin(android.content.Context c, java.lang.String status) {
    if ((status == null) || ((status.equals("success")) != true)) {
        android.content.Intent returnIntent = new android.content.Intent(c, com.example.wordquiz.LoginActivity.class);
        c.startActivity(returnIntent);
        return true;
    }
    return false;
}