public java.util.List<java.lang.String> filter(int passwordFlags, java.util.List<java.lang.String> password) {
    java.util.List<java.lang.String> suiatble = new java.util.ArrayList<java.lang.String>();
    for (java.util.Iterator<java.lang.String> iter = password.iterator(); iter.hasNext();) {
        java.lang.String element = ((java.lang.String) (iter.next()));
        if ((filter(passwordFlags, password)) != null)
            suiatble.add(element);
        
    }
    return suiatble;
}