public void flatten3(TreeNode root) {
    TreeNode curr = root;
    while (curr != null) {
        if ((curr.left) != null) {
            if ((curr.right) != null) {
                TreeNode next = curr.left;
                while ((next.right) != null) {
                    next = next.right;
                } 
                next.right = curr.right;
            }
            curr.right = curr.left;
        }
        curr.right = curr.left;
        curr.left = null;
    } 
}