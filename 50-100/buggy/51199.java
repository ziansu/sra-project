@java.lang.Override
public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
    if ((self.getContext().equals(activity)) || (self.getContext().equals(com.vilyever.contextholder.ContextHolder.getContext()))) {
        self.onActivitySaveInstanceState(activity, outState);
    }
}