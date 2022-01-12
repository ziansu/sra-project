private java.lang.String getSelectedRow(int selectedRow) {
    Opcion opcion = new Opcion();
    opcion.Ejercicio = TablaOpcionesPUT.getValueAt(selectedRow, 0).toString();
    opcion.Tipo = "PUT";
    opcion.Vencimiento = TablaOpcionesPUT.getValueAt(selectedRow, 8).toString();
    opcion.Compra_Precio = TablaOpcionesPUT.getValueAt(selectedRow, 2).toString();
    optionsToWallet.add(opcion.toString());
    return opcion.toString();
}