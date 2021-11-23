public boolean equals(java.lang.Object other) {
    if (other.equals(null))
        throw new java.lang.NullPointerException("equals() input null");
    
    if ((this) == other)
        return true;
    
    if (!(other instanceof Rational))
        return false;
    
    if ((compareTo(other)) == 0)
        return true;
    
    return false;
}