public com.brouding.simpledialog.SimpleDialog.Builder setCustomView(@android.support.annotation.NonNull
android.view.View view) {
    if ((this.textContent) != null) {
        throw new java.lang.IllegalStateException("You cannot use customView() when you have content");
    }else
        if (this.showProgress) {
            throw new java.lang.IllegalStateException("You cannot use customView() when you want progress SimpleDialog");
        }
    
    if (((view.getParent()) != null) && ((view.getParent()) instanceof android.view.ViewGroup)) {
        ((android.view.ViewGroup) (view.getParent())).removeView(view);
    }
    this.customView = view;
    return this;
}