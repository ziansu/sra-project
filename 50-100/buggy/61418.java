private java.util.Set getClientPrincipals(javax.security.auth.Subject subj) {
    java.util.Set cpset = subj.getPrincipals();
    synchronized(cpset) {
        java.util.HashSet set = new java.util.HashSet(cpset.size());
        for (java.util.Iterator iter = cpset.iterator(); iter.hasNext();) {
            java.lang.Object p = iter.next();
            if (p instanceof javax.security.auth.kerberos.KerberosPrincipal)
                set.add(p);
            
        }
        return set;
    }
}