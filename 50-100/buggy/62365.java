public boolean addNewCategory(java.lang.String name) {
    if ((categories.containsKey(name)) == false) {
        feeder.model.Category category = new feeder.model.Category(name);
        javax.swing.tree.DefaultMutableTreeNode node = new javax.swing.tree.DefaultMutableTreeNode(name);
        categories.put(name, category);
        root.add(node);
        category.setIndex(root.getIndex(node));
        treeModel.reload();
        return true;
    }else {
        return false;
    }
}