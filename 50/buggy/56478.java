public void decrement(android.view.View view) {
    android.util.Log.d("CounterFrag", "Decremented Count");
    --(count);
    updateFieldFromCount();
}