@java.lang.Override
public java.lang.Iterable<org.jenkinsci.plugins.uicontrol.TreeNode> children() {
    java.io.File[] children = file.listFiles();
    java.util.List<org.jenkinsci.plugins.uicontrol.TreeNode> r = new java.util.ArrayList<org.jenkinsci.plugins.uicontrol.TreeNode>();
    if (children != null) {
        for (java.io.File c : children) {
            r.add(new FileTreeNode(c));
        }
    }
    return r;
}