public com.pmarlen.backend.model.quickviews.EntradaSalidaDetalleQuickView reverse() {
    com.pmarlen.backend.model.quickviews.EntradaSalidaDetalleQuickView esd = new com.pmarlen.backend.model.quickviews.EntradaSalidaDetalleQuickView();
    esd.setProductoCodigoBarras(cb);
    esd.setAlmacenId(a);
    esd.setCantidad(c);
    esd.setPrecioVenta(p);
    if ((dev) != null) {
        esd.setDev(dev);
    }
    if ((esIdDev) != null) {
        esd.setEsIdDev(esIdDev);
    }
    esd.setApTipoAlmacen(ta);
    return esd;
}