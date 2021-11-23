@java.lang.Override
public void onResume() {
    super.onResume();
    s.setSelection(savedValues.getInt("spinnerPositie", 0));
}