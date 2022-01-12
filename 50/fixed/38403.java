@java.lang.Override
public void onClick(android.view.View v) {
    if ((mFragment) != null) {
        if (!(mFragment.createBill()))
            android.util.Log.d("ActivityNewBill", "DoneButton - creating bill returned false");
        else
            finish();
        
    }
}