private void performControllerChange(final com.bluelinelabs.conductor.Controller to, final com.bluelinelabs.conductor.Controller from, boolean isPush, @android.support.annotation.NonNull
com.bluelinelabs.conductor.ControllerChangeHandler changeHandler) {
    if (to != null) {
        setControllerRouter(to);
    }else
        if (((mBackStack.size()) == 0) && (!(mPopsLastView))) {
            changeHandler = new com.bluelinelabs.conductor.internal.NoOpControllerChangeHandler();
        }
    
    com.bluelinelabs.conductor.ControllerChangeHandler.executeChange(to, from, isPush, mContainer, changeHandler, mChangeListeners);
}