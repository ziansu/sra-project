@java.lang.Override
public void onBackPressed() {
    if (history.isEmpty()) {
        finish();
    }else {
        showScreen(history.pop(), false);
    }
}