@java.lang.Override
public java.util.List<java.lang.String> filter(final int passwordFlags, final java.util.List<java.lang.String> password) {
    java.util.List<java.lang.String> suiatble = new java.util.ArrayList<java.lang.String>();
    for (java.util.Iterator<java.lang.String> iter = password.iterator(); iter.hasNext();) {
        java.lang.String element = iter.next();
        if ((filter(passwordFlags, password)) != null) {
            suiatble.add(element);
        }
    }
    return suiatble;
}