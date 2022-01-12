@java.lang.Override
public void done(java.util.ArrayList data) {
    android.util.Log.d("DB TEST", ("TOTAL BOOKS = " + (data.size())));
    for (int i = 0; i < (data.size()); i++) {
        android.util.Log.d("DB TEST", ("--------------------  " + (data.toString())));
    }
}