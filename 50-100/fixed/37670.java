public com.brouding.simpledialog.SimpleDialog.Builder setCustomView(@android.support.annotation.NonNull
android.view.View view) {
    if (((view.getParent()) != null) && ((view.getParent()) instanceof android.view.ViewGroup)) {
        ((android.view.ViewGroup) (view.getParent())).removeView(view);
    }
    this.customView = view;
    return this;
}