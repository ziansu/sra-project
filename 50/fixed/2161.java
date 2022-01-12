@java.lang.Override
public void onResume() {
    super.onResume();
    if (getUserVisibleHint()) {
        load(step);
    }
}