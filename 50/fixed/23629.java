@java.lang.Override
public void run() {
    android.util.Log.i("TTM", "Successfully loaded offline globals for week fragment.");
    applyGlobalContent(true, false, rootView, activity);
}