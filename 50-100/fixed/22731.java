@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.v("$$$$$$", "In Method: onResume()");
    sharedpreferences = getSharedPreferences(com.example.bobthebuilder.MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
    if (sharedpreferences.contains(com.example.bobthebuilder.MainActivity.BuiltScore)) {
    }
    if (sharedpreferences.contains(com.example.bobthebuilder.MainActivity.UnBuiltScore)) {
    }
}