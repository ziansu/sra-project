public boolean equals(java.lang.Object other) {
    if (other == null)
        throw new nullPointerException("equals() input null");
    
    if ((this) == other)
        return true;
    
    if (!(other instanceof Rational))
        return false;
    
    if ((compareTo(other)) == 0)
        return true;
    
    return false;
}