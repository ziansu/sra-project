private void refreshTreeBean() {
    try {
        if ((treeBean) != null) {
            java.util.List<javax.swing.tree.TreeNode> rootNodes = new java.util.ArrayList<javax.swing.tree.TreeNode>();
            treeBean.setRootNodes(rootNodes);
            treeBean.init();
        }
    } catch (java.lang.NullPointerException ne) {
        com.cdc.spring.controller.PTController.log.error(("NullPointerException occured in refreshing the ProjectTracker Tree of PTController.refreshTreeBean() " + ne));
    } catch (java.lang.Exception ex) {
        com.cdc.spring.controller.PTController.log.error(("Exception occured in refreshing the ProjectTracker Tree of PTController.refreshTreeBean() " + ex));
    }
}