private java.lang.Boolean page_child_exists(java.lang.String name) {
    if (page_children.contains(name))
        return page_children.get(name);
    
    return false;
}