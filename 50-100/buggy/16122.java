public void deleteTabByGraphId(int graphId) {
    int index = -1;
    int counter = 0;
    java.lang.System.out.println(("delete grapg" + graphId));
    for (gui.GraphTab graphTab : graphTabs) {
        java.lang.System.out.println(graphTab.getId());
        if ((graphTab.getId()) == graphId) {
            index = counter;
        }
        counter++;
    }
    if (index != (-1)) {
        graphTabs.remove(index);
        gui.GUIPane.tabbedPane.remove(index);
    }
}