private java.lang.String getLevel(TreeNode<E> curr, int level, int currLevel) {
    if (curr == null) {
        return "";
    }else
        if (level == currLevel) {
            return "" + (curr.getData());
        }else {
            return (getLevel(curr.getLeft(), level, (currLevel + 1))) + (getLevel(curr.getRight(), level, (currLevel + 1)));
        }
    
}