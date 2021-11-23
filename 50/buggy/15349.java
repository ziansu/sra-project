@java.lang.Override
public void onResume() {
    super.onResume();
    displayCards();
    android.util.Log.e("111", "displayCards() called by onResume()");
}