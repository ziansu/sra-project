public boolean isOrExtends(com.parsleyj.tool.ToolClass type) {
    com.parsleyj.tool.ToolClass tmp = type;
    while (tmp != null) {
        if (java.util.Objects.equals(this.getId(), tmp.getId()))
            return true;
        
        tmp = tmp.getParentClass();
    } 
    return false;
}