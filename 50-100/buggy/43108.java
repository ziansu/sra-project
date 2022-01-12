public void setSource(edmondskarp.Gui.Circle node) {
    java.lang.String tmp = "";
    try {
        tmp = getState();
    } catch (org.json.JSONException ex) {
        java.util.logging.Logger.getLogger(edmondskarp.Controller.EdmondsKarpController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    if (!(graph.setSource(graph.getNode(node.getName())))) {
        gui.displayMessage("La sorgente non può avere archi entranti");
    }else {
        saveState(tmp);
        gui.update();
    }
}