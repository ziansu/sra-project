public static int getTreeHeight(org.wso2.developerstudio.datamapper.TreeNode tree, int leafHeight) {
    int h = org.wso2.developerstudio.datamapper.diagram.custom.util.TreeNodeUtils.getTreeHeight(tree);
    if (h < 4) {
        return 100;
    }else
        return (h + 1) * leafHeight;
    
}