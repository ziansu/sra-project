public void unSelectObjects(java.util.List<dataStructure.objects.StructureObject> objects) {
    boa.gui.GUI.logger.debug("unselect {} objects, sel before: {}", objects.size(), tree.getSelectionCount());
    java.util.List<javax.swing.tree.TreePath> list = new java.util.ArrayList<javax.swing.tree.TreePath>(objects.size());
    for (dataStructure.objects.StructureObject o : objects)
        list.add(getObjectTreePath(o));
    
    utils.Utils.removeFromSelectionPaths(tree, list);
    boa.gui.GUI.logger.debug("unselect {} objects, sel after: {}", objects.size(), tree.getSelectionCount());
}