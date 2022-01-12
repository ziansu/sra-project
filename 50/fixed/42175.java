public void actionPerformed(java.awt.event.ActionEvent ev) {
    if (!(isSelectedTagetNode)) {
        isSelectedStartNode = naviStartNode.isSelected();
    }else {
        naviStartNode.setSelected(false);
    }
}