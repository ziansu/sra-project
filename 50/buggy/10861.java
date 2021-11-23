@butterknife.OnClick(value = R.id.view_helper_overlay_button)
void dismissOverlay() {
    ((android.view.ViewGroup) (getParent())).removeView(this);
}