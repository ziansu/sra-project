private void OpenActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        java.lang.String tmp = openGraph(null);
        if (tmp != null) {
            controller.open(tmp);
        }
        update();
    } catch (org.json.JSONException ex) {
        java.util.logging.Logger.getLogger(edmondskarp.Gui.EdmondsKarpGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}