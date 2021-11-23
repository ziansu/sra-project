@java.lang.Override
public void d(java.lang.String text, java.lang.Object... args) {
    if (isDebugEnabled())
        android.util.Log.d(TAG, java.lang.String.format(text, args));
    
}