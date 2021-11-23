@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    int id = java.lang.Integer.parseInt(idfield.getText());
    map.getVoxelAt(camera.getActiveTile().x, camera.getYLevel(), camera.getActiveTile().y).addLayerMaterial(dataBackend.getMaterialByID(id));
    camera.start();
    helper.dispose();
}