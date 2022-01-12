public void setSink(edmondskarp.Gui.Circle circle) {
    if (!(graph.setSink(graph.getNode(circle.getName())))) {
        gui.displayMessage("Il pozzo non può avere archi uscenti");
    }else {
        gui.update();
        saveState();
    }
}