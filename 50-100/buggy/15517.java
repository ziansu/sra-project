public void validate() {
    com.mka.common.ProfileValidator valid = new com.mka.common.ProfileValidator(profile);
    final java.util.List<com.mka.common.ErrorType<java.lang.String, java.lang.String>> errors = valid.Validate();
    for (com.mka.common.ErrorType<java.lang.String, java.lang.String> error : errors) {
        addFieldError(error.getItem(), error.getValue());
    }
}