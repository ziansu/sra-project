public boolean isOrExtends(com.parsleyj.tool.ToolClass type) {
    com.parsleyj.tool.ToolClass tmp = this;
    while (tmp != null) {
        if (java.util.Objects.equals(type.getId(), tmp.getId()))
            return true;
        
        tmp = tmp.getParentClass();
    } 
    return false;
}