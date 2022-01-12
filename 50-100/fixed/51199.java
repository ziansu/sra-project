@java.lang.Override
public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
    if ((self.getContext().equals(activity)) || (!((self.getContext()) instanceof android.app.Activity))) {
        self.onActivitySaveInstanceState(activity, outState);
    }
}