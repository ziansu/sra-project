private java.lang.Boolean page_child_exists(java.lang.String str) {
    if (page_children.contains(str))
        return page_children.get(str);
    
    return false;
}