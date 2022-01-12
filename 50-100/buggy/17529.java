public void flyThrough(gov.nasa.arc.dert.scene.tool.Path path, java.awt.Dialog owner) {
    if ((flyThroughDialog) != null) {
        java.awt.Toolkit.getDefaultToolkit().beep();
        return ;
    }
    flyThroughDialog = new gov.nasa.arc.dert.view.viewpoint.FlyThroughDialog(owner, this);
    flyThroughDialog.pack();
    flyThroughDialog.setLocationRelativeTo(owner);
    flyThroughDialog.setPath(path);
    flyThroughDialog.setVisible(true);
}