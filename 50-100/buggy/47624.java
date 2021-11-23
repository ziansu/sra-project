@java.lang.Override
public void run() {
    try {
        applyGlobalContent(false, view, activity);
        android.support.design.widget.Snackbar.make(view, (today ? "Updated to today!" : "Updated!"), Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}