@java.lang.Override
public java.lang.String toString() {
    if (this.preference.equals("default"))
        return this.machine;
    
    return ((this.machine) + ".") + (this.preference);
}