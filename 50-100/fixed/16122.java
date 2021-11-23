public void deleteTabByGraphId(int graphId) {
    int index = -1;
    int counter = 0;
    for (gui.GraphTab graphTab : graphTabs) {
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