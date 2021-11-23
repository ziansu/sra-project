@java.lang.Override
public java.lang.String getInventoryName() {
    if ((type) == null)
        return "NULL";
    
    return type.getShowedName();
}