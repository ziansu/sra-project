@java.lang.Override
public void addMenuItemListener(java.awt.event.ActionListener l, int index, java.lang.String... path) throws java.lang.IllegalArgumentException {
    final org.jtrfp.trcl.gui.SwingMenuSystem.MenuNode node = nameMap.get(path[index]);
    for (java.lang.String s : nameMap.keySet())
        java.lang.System.out.println(("key: " + s));
    
    if (node == null)
        throw new java.lang.IllegalArgumentException(((("Failed to find node: `" + (path[index])) + "` at index ") + index));
    
    node.addMenuItemListener(l, (index + 1), path);
}