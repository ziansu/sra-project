final void destroy(boolean removeViews) {
    mIsBeingDestroyed = true;
    for (com.bluelinelabs.conductor.ChildControllerTransaction child : mChildControllers) {
        child.controller.destroy(removeViews);
    }
    if (!(mAttached)) {
        removeViewReference();
    }else
        if (removeViews) {
            detach(mView);
        }
    
}