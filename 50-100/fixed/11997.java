public void updateState(java.lang.String key, java.lang.Object value) {
    if (((key.equals("LoginError")) == true) && (!(value.equals("")))) {
        displayErrorMessage(((java.lang.String) (value)));
    }
}