@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d(TAG, "onSaveInstanceState - start");
    super.onSaveInstanceState(outState);
    outState.putInt(DetailActivity.DATABASE_ID, model.getDbId());
    android.util.Log.d(TAG, "onSaveInstanceState - finish");
}