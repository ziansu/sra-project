private void readNode(org.i3xx.util.ctree.IConfNode node, java.util.Map<java.lang.String, java.lang.String> entries) {
    if (node.isLeafNode()) {
        entries.put(node.getFullName(), node.rawValue());
    }else {
        entries.put(node.getFullName(), node.rawValue());
        for (org.i3xx.util.ctree.IConfNode n : node.getChildNodes3())
            readNode(n, entries);
        
    }
}