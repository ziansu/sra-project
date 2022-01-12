protected boolean contains(T value) throws java.lang.IllegalArgumentException {
    if (value == null)
        throw com.arredondo.samples.binarytree.BinaryTreeNode.nullArg();
    
    int comp = value.compareTo(this.value);
    if (comp < 0)
        return ((left) != null) && (left.contains(value));
    else
        if (comp > 0)
            return ((right) != null) && (right.contains(value));
        else
            return true;
        
    
}