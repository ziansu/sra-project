@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    taskAdapter.saveState(this, outState);
    super.onSaveInstanceState(outState);
}