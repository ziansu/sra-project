public final void onActivityDestroyed(android.app.Activity activity) {
    mContainer.setOnHierarchyChangeListener(null);
    mLifecycleHandler = null;
    mContainer = null;
    mChangeListeners.clear();
    for (com.bluelinelabs.conductor.RouterTransaction transaction : mBackStack) {
        transaction.controller.activityDestroyed(activity.isChangingConfigurations());
    }
}