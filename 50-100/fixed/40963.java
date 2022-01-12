@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == null)
        return false;
    
    if (other == (this))
        return true;
    
    if ((this.getClass()) != (other.getClass()))
        return false;
    
    return (this.contents) == (((soot.jimple.infoflow.collect.IdentityWrapper) (other)).contents);
}