public java.lang.String zig(model.SplayTree._Node parent, model.SplayTree._Node child) {
    if ((parent.left) == child) {
        model.SplayTree._Node tmp = child.right;
        child.right = parent;
        child.parent = null;
        parent.left = tmp;
        tmp.parent = parent;
    }
    if ((parent.right) == child) {
        model.SplayTree._Node tmp = child.left;
        child.left = parent;
        child.parent = null;
        parent.right = tmp;
        tmp.parent = parent;
    }else
        return "Cannot zig when parent is not root";
    
    return null;
}