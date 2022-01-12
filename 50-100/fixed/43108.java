public void setSource(edmondskarp.Gui.Circle node) {
    if (!(graph.setSource(graph.getNode(node.getName())))) {
        gui.displayMessage("La sorgente non può avere archi entranti");
    }else {
        gui.update();
        saveState();
    }
}