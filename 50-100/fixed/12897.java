private void addMember(final com.enonic.xp.security.PrincipalKey container, final com.enonic.xp.security.PrincipalKey member) {
    try {
        securityService.addRelationship(com.enonic.xp.security.PrincipalRelationship.from(container).to(member));
        com.enonic.xp.core.impl.security.SecurityInitializer.LOG.info(((("Added " + member) + " as member of ") + container));
    } catch (final java.lang.Exception t) {
        com.enonic.xp.core.impl.security.SecurityInitializer.LOG.error(((("Unable to add member: " + container) + " -> ") + member), t);
    }
}