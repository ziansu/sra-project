@java.lang.Override
public void onBackPressed() {
    if (is_in_action_mode) {
        clearActionM();
        adapter.notifyDataSetChanged();
    }else {
        finish();
    }
    super.onBackPressed();
}