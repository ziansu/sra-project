@java.lang.Override
public void onResume() {
    if ((state) != null) {
        restoreState(state);
    }
    super.onResume();
}