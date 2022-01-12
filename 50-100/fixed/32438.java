@java.lang.Override
public java.util.List<java.lang.Integer> getParents(int index) {
    java.util.List<java.lang.Integer> parents = new java.util.ArrayList<java.lang.Integer>();
    for (int v = 0; v < (size()); v++) {
        if (v == index)
            continue;
        
        for (int child : getChildren(v)) {
            if (child == index)
                parents.add(v);
            
        }
    }
    return parents;
}