private void removeSubForm() {
    formLayout.setVisibility(com.auth0.android.lock.views.VISIBLE);
    if ((this.subForm) != null) {
        removeView(this.subForm);
        this.subForm = null;
    }
}