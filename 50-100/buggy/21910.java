public void setSink(edmondskarp.Gui.Circle circle) {
    java.lang.String tmp = "";
    try {
        tmp = getState();
    } catch (org.json.JSONException ex) {
        java.util.logging.Logger.getLogger(edmondskarp.Controller.EdmondsKarpController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    if (!(graph.setSink(graph.getNode(circle.getName())))) {
        gui.displayMessage("Il pozzo non può avere archi uscenti");
    }else {
        saveState(tmp);
        gui.update();
    }
}