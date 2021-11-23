@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle bundle) {
    currentState = bundle.getParcelable("state");
    onActivityModeChanged();
    super.onRestoreInstanceState(bundle);
}