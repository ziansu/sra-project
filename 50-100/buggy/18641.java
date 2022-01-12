Demo.PaketeIce convertirPakete(entitys.system.Pakete pakete) {
    Demo.PaketeIce paketeIce = null;
    paketeIce.estado = pakete.getEstado();
    paketeIce.id = pakete.getId();
    for (int i = 0; i < (pakete.getListaProductos().size()); i++) {
        Demo.ProductoIce productoIce = convertirProducto(pakete.getListaProductos().get(i));
        paketeIce.listaProductos.add(productoIce);
    }
    return paketeIce;
}