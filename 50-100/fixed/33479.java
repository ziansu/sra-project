private void setOrgTreeStats(com.company.Org node) {
    java.util.Iterator<com.company.Org> children = node.getChildOrgs().iterator();
    while (children.hasNext()) {
        com.company.Org child = children.next();
        setOrgTreeStats(child);
    } 
    if (((node.parent) != null) && (node != null)) {
        node.parent.descendentsNumBytes += node.orgBytes;
        node.parent.descendentsNumFiles += node.orgFiles;
        node.parent.descendentsNumUsers += node.getChildOrgs().size();
    }
}