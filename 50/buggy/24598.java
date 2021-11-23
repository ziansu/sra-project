public void setError(java.lang.String errorText) {
    if (asserter.assertPointerQuietly(this.error)) {
        this.error.setText(errorText);
    }else {
        this.errorText = errorText;
    }
    internalSetError();
}