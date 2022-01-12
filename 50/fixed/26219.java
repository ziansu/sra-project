public void increment() {
    android.util.Log.d("CounterFrag", "Incremented Count");
    ++(count);
    updateFieldFromCount();
}