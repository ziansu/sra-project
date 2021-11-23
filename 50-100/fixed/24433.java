public static void studentRegistrationDetail(java.lang.String[] s) {
    android.util.Log.d("digvijay", "function is called");
    for (int i = 0; i < (s.length); i++) {
        com.example.shivanshu.alumniconnect.DetailHandleModel.DetailArray[i] = s[i];
    }
}