public void setError(java.lang.CharSequence error) {
    if (error != null) {
        mWrapper.setError(error);
        mWrapper.setErrorEnabled(true);
    }else {
        mWrapper.setErrorEnabled(false);
    }
}