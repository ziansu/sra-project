public org.zapodot.junit.ldap.EmbeddedLdapRuleBuilder withoutDefaultSchema() {
    this.addDefaultSchema = false;
    return this;
}