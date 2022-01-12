int[] getAnchorPath() {
    java.util.ArrayList<java.lang.Integer> ap = new java.util.ArrayList<java.lang.Integer>();
    findafs.AFSNode curNode = this;
    while (curNode != null) {
        ap.add(node);
        curNode = curNode.parent;
    } 
    int[] pa = new int[ap.size()];
    int i = (ap.size()) - 1;
    for (java.lang.Integer N : ap) {
        pa[(i--)] = N;
    }
    return pa;
}