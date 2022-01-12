@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean("noBt", ((btManager) == null));
}