@java.lang.Override
public java.lang.String toString() {
    if ("default".equals(this.preference))
        return this.machine;
    
    return ((this.machine) + ".") + (this.preference);
}