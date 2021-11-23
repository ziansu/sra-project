@java.lang.Override
public void onResume() {
    super.onResume();
    if ((model.getActiveMeal()) == null) {
        finish();
    }
}