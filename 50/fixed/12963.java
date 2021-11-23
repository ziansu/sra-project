@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((lastUpdate) != null) {
        outState.putSerializable("disturbances", disturbances);
        outState.putLong("updated", lastUpdate.getMillis());
    }
}