@java.lang.Override
public void onBackPressed() {
    if ((adapter.getSelectedItemCount()) > 0) {
        adapter.deselectAll();
    }
}