private void OpenActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        controller.open(openGraph());
    } catch (org.json.JSONException ex) {
        java.util.logging.Logger.getLogger(edmondskarp.Gui.EdmondsKarpGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    update();
}