private void displayErrorMessage(int errorMessageResource) {
    try {
        java.lang.String errorMessage = getString(errorMessageResource);
        previewImageView.setVisibility(View.GONE);
        errorMessageTextView.setText(errorMessage);
        errorMessageTextView.setVisibility(View.VISIBLE);
    } catch (java.lang.RuntimeException e) {
    }
}