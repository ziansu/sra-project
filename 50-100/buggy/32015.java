public void traverse(Node node, Func func) {
    switch (node.getNodeType()) {
        case LEAF :
            func.call(this, node);
            break;
        case POINTER :
            this.traverse(node.getNe(), func);
            this.traverse(node.getSe(), func);
            this.traverse(node.getSw(), func);
            this.traverse(node.getNw(), func);
            break;
    }
}