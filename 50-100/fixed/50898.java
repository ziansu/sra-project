public java.lang.Object writeReplace(final java.lang.Object original) {
    if ((original == (org.jboss.ejb.client.Affinity.LOCAL)) && ((selfNodeAffinity) != null)) {
        return selfNodeAffinity;
    }else
        if (((((peerUriAffinity) != null) && (original instanceof org.jboss.ejb.client.URIAffinity)) && (original.equals(peerUriAffinity))) && ((peerNodeAffinity) != null)) {
            return peerNodeAffinity;
        }
    
    return original;
}