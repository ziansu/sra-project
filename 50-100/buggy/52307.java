private org.publicmain.common.Node getMinNode(java.util.Collection<org.publicmain.common.Node> selection) {
    org.publicmain.common.Node theone = null;
    for (org.publicmain.common.Node node : selection) {
        if (theone == null) {
            theone = node;
        }else
            if ((theone.getChildCount()) < (node.getChildCount())) {
                theone = node;
            }
        
    }
    return theone;
}