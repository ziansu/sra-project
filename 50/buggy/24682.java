public org.adam.currency.builder.UserBuilder withRoles(java.util.List<org.adam.currency.domain.Role> roles) {
    if ((roles != null) && ((roles.size()) > 0)) {
        this.roles.addAll(roles);
    }
    return this;
}