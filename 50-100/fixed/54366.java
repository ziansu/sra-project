@java.lang.Override
public int compareTo(org.bndtools.templating.Category o) {
    int diff;
    if ((this.prefix) == null)
        diff = ((o.prefix) == null) ? 0 : 1;
    else
        if ((o.prefix) == null)
            diff = -1;
        else
            diff = this.prefix.compareTo(o.prefix);
        
    
    if (diff != 0)
        return diff;
    
    return this.name.compareTo(o.name);
}