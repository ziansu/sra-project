@java.lang.Override
public boolean equals(java.lang.Object that) {
    if (that == (this))
        return true;
    
    if (!(that instanceof leon.codegen.runtime.Set))
        return false;
    
    leon.codegen.runtime.Set other = ((leon.codegen.runtime.Set) (that));
    if ((this.size()) != (other.size()))
        return false;
    
    return this.subsetOf(other);
}