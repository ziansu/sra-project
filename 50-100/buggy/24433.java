public static void studentRegistrationDetail(java.lang.String[] s) {
    android.util.Log.d("digvijay", "function is called");
    for (int i = 0; i < (s.length); i++) {
        android.util.Log.d("digvijay", "loop is called");
        com.example.shivanshu.alumniconnect.DetailHandleModel.DetailArray[i] = s[i];
        android.util.Log.d("digvijay", com.example.shivanshu.alumniconnect.DetailHandleModel.DetailArray[i]);
    }
}