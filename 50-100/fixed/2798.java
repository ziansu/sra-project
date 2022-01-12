static void e(java.lang.String message) {
    if (((!(com.basilgregory.onam.android.L.error)) || (message == null)) || (message.isEmpty()))
        return ;
    
    android.util.Log.d("ONAM/error", ("" + message));
}