private static void LOG(java.lang.String message, java.lang.Object... args) {
    if (args != null)
        message = java.lang.String.format(message, args);
    
    android.util.Log.d("BetterVideoPlayer", message);
}