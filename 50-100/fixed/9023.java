@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (!(obj instanceof iguana.utils.input.Input))
        return false;
    
    iguana.utils.input.Input other = ((iguana.utils.input.Input) (obj));
    return ((this.length()) == (other.length())) && (java.util.Arrays.equals(characters, other.characters));
}