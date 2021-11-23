private void setRole(java.lang.String role) {
    if (role == null) {
        throw new java.lang.IllegalArgumentException(exceptions.data.ErrorMessageHelper.nullOrEmptyMessage("UserRole"));
    }
    this.role = role.toString();
}