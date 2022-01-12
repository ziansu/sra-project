Demo.ProductoIce convertirProducto(entitys.system.Producto producto) {
    Demo.ProductoIce productoIce = new Demo.ProductoIce();
    productoIce.categoriaId = producto.getCategoriaId();
    productoIce.estanteriaId = producto.getEstanteriaId();
    productoIce.fechaCaducidad = producto.getFechaCaducidad();
    productoIce.nombre = producto.getNombre();
    productoIce.productoId = producto.getProductoId();
    return productoIce;
}