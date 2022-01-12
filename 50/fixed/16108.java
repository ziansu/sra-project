@java.lang.Override
public void onBackPressed() {
    android.util.Log.d("TKT_create", "onBackPressed");
    if (!(state.isEmpty()))
        saveChanges(0);
    else
        super.onBackPressed();
    
}