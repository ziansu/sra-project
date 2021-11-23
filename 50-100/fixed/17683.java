public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    if (other instanceof ox.lang.Keyword) {
        ox.lang.Keyword otherK = ((ox.lang.Keyword) (other));
        return (name.equals(otherK.name)) && ((((namespace) == null) && ((otherK.namespace) == null)) || (namespace.equals(otherK.namespace)));
    }else {
        return false;
    }
}