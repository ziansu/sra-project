private java.lang.Boolean in_page_child() {
    for (java.lang.String name : page_children.keySet())
        if (in_tag(name))
            return true;
        
    
    return false;
}