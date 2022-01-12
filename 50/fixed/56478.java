public void decrement() {
    android.util.Log.d("CounterFrag", "Decremented Count");
    --(count);
    updateFieldFromCount();
}