private void botonAniadirActionPerformed(java.awt.event.ActionEvent evt) {
    recoleccionDatosVentana();
    if (!(odb.isClosed()))
        controlador.datos.NeoDatis.cerrarConexion();
    
}