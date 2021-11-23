@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d(TAG, "onSaveInstanceState - start");
    outState.putInt(DetailActivity.DATABASE_ID, model.getDbId());
    super.onSaveInstanceState(outState);
    android.util.Log.d(TAG, "onSaveInstanceState - finish");
}