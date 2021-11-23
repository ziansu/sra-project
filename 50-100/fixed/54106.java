private void add(int val, answers.cc150.chapter04.Node node) {
    if (node == null) {
        return ;
    }else
        if ((node.val) > val) {
            if ((node.left) == null) {
                node.left = new answers.cc150.chapter04.Node(val);
            }else {
                add(val, node.left);
            }
        }else
            if ((node.val) < val) {
                if ((node.right) == null) {
                    node.right = new answers.cc150.chapter04.Node(val);
                }else {
                    add(val, node.right);
                }
            }
        
    
}