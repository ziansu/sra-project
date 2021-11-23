private boolean isEmailValid() {
    if (isEditTextEmpty(emailEditText)) {
        return false;
    }
    if (!(org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(emailEditText.getText().toString().trim()))) {
        emailEditText.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.shake));
        emailEditText.setError("Field must contain a valid E-Mail");
        return false;
    }
    return true;
}