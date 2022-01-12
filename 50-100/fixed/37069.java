private com.google.engedu.bstguesser.TreeNode search(int value) {
    com.google.engedu.bstguesser.TreeNode current = root;
    while ((current != null) || (current != null)) {
        if ((current.getValue()) == value) {
            return current;
        }else
            if ((current.getValue()) < value) {
                current = current.right;
            }else
                if ((current.getValue()) > value) {
                    current = current.left;
                }
            
        
    } 
    return current;
}