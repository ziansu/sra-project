private void add(int val, answers.cc150.chapter04.Node node) {
    if (node == null) {
        node = new answers.cc150.chapter04.Node(val);
    }else
        if ((node.val) > val) {
            add(val, node.left);
        }else
            if ((node.val) < val) {
                add(val, node.right);
            }
        
    
}