@java.lang.Override
public void onBackPressed() {
    android.util.Log.d(com.lerenard.counter3.CounterActivity.TAG, "onBackPressed");
    android.util.Log.d(com.lerenard.counter3.CounterActivity.TAG, com.lerenard.counter3.MainActivity.getDatabase().toString());
    android.content.Intent data = new android.content.Intent();
    data.putExtra(MainActivity.INTENT_EXTRA_COUNT, getCount());
    if ((index) != (-1)) {
        data.putExtra(MainActivity.INTENT_EXTRA_INDEX, index);
    }
    setResult(com.lerenard.counter3.RESULT_OK, data);
    finish();
}