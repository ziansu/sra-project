@java.lang.Override
public boolean equals(java.lang.Object other) {
    if ((other == null) || (!(other instanceof shadow.tac.TACVariable)))
        return false;
    
    if (other == (this))
        return true;
    
    shadow.tac.TACVariable var = ((shadow.tac.TACVariable) (other));
    return getName().equals(var.getName());
}