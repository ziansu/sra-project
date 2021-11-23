public org.adam.currency.builder.UserBuilder withRoles(java.util.List<org.adam.currency.domain.Role> roles) {
    if ((roles != null) && (!(roles.isEmpty()))) {
        this.roles.addAll(roles);
    }
    return this;
}