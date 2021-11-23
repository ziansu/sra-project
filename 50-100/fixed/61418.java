private java.util.Set<javax.security.auth.kerberos.KerberosPrincipal> getClientPrincipals(javax.security.auth.Subject subj) {
    java.util.Set cpset = subj.getPrincipals();
    synchronized(cpset) {
        java.util.Set<javax.security.auth.kerberos.KerberosPrincipal> set = new java.util.HashSet<javax.security.auth.kerberos.KerberosPrincipal>(cpset.size());
        for (java.util.Iterator iter = cpset.iterator(); iter.hasNext();) {
            java.lang.Object p = iter.next();
            if (p instanceof javax.security.auth.kerberos.KerberosPrincipal)
                set.add(((javax.security.auth.kerberos.KerberosPrincipal) (p)));
            
        }
        return set;
    }
}