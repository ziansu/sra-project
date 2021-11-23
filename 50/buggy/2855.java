@java.lang.Override
public void onResume() {
    super.onResume();
    model.clearActives();
    view.update();
}