protected void selectionChanged(org.esa.beam.framework.datamodel.Product product, org.esa.beam.framework.datamodel.RasterDataNode raster, org.esa.beam.framework.datamodel.VectorDataNode vectorDataNode) {
    if (((raster != (getRaster())) || (product != (getProduct()))) || (vectorDataNode != (getVectorDataNode()))) {
        setRaster(raster);
        setProduct(product);
        setVectorDataNode(vectorDataNode);
    }
    invokeUpdateUI();
}