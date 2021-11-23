public java.util.Set<org.sbolstandard.core2.TopLevel> getMembers() {
    java.util.Set<org.sbolstandard.core2.TopLevel> result = new java.util.HashSet<>();
    for (java.net.URI memberURI : members) {
        org.sbolstandard.core2.TopLevel member = this.getDocument().getTopLevel(memberURI);
        result.add(member);
    }
    return result;
}