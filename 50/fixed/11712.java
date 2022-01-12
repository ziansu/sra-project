@java.lang.Override
public boolean expands() {
    if ((this.fields.length) == 0)
        return false;
    
    return this.fields[((this.fields.length) - 1)].getType().expands();
}