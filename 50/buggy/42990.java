private void removeSubForm() {
    formLayout.setVisibility(com.auth0.android.lock.views.VISIBLE);
    showSignUpTerms((!(keyboardIsOpen)));
    if ((this.subForm) != null) {
        removeView(this.subForm);
        this.subForm = null;
    }
}