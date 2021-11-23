public void paste() {
    ca.mcgill.cs.stg.jetuml.framework.GraphFrame frame = ((ca.mcgill.cs.stg.jetuml.framework.GraphFrame) (aDesktop.getSelectedFrame()));
    if (frame == null) {
        return ;
    }
    ca.mcgill.cs.stg.jetuml.graph.Graph curGraph = frame.getGraph();
    ca.mcgill.cs.stg.jetuml.framework.GraphPanel panel = frame.getGraphPanel();
    try {
        ca.mcgill.cs.stg.jetuml.framework.SelectionList updatedSelectionList = aClipboard.pasteInto(curGraph);
        panel.setSelectionList(updatedSelectionList);
        panel.repaint();
    } finally {
    }
}