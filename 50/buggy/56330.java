public void serialize() {
    this.domBuilder.start("permissions");
    for (final com.enonic.xp.security.acl.AccessControlEntry entry : this.accessControlList) {
        serialize(entry);
    }
}