@java.lang.Override
public void run() {
    try {
        applyGlobalContent(false, view, activity);
        android.support.design.widget.Snackbar.make(view, "Updated special date!", Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}