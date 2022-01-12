public void setTreeVisible(boolean visible) {
    revalidate();
    if (visible) {
        splitPane.setLeftComponent(treePanel);
        splitPane.setRightComponent(map);
        add(splitPane, java.awt.BorderLayout.CENTER);
    }else
        add(map, java.awt.BorderLayout.CENTER);
    
    repaint();
}