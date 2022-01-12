public int GetAllProductAndMaterialRepertory(java.lang.String barcode) {
    com.jsp.support.Material_Storage hMSHandle = new com.jsp.support.Material_Storage(new com.jsp.support.EarthquakeManagement());
    com.jsp.support.Product_Storage hPSHandle = new com.jsp.support.Product_Storage(new com.jsp.support.EarthquakeManagement());
    return (hMSHandle.GetRepertoryByKeyList(java.util.Arrays.asList("Bar_Code"), java.util.Arrays.asList(hMSHandle.GetUsedBarcode(barcode, "product_storage")))) + (hPSHandle.GetRepertoryByKeyList(java.util.Arrays.asList("Bar_Code"), java.util.Arrays.asList(hPSHandle.GetUsedBarcode(barcode, "material_storage"))));
}