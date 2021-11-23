public int GetProductRepertory(java.lang.String strBarcode, java.lang.String po_name) {
    com.jsp.support.Product_Storage hPSHandle = new com.jsp.support.Product_Storage(new com.jsp.support.EarthquakeManagement());
    java.lang.String curBarcode = GetUsedBarcode(strBarcode, "product_storage");
    return (hPSHandle.GetRepertoryByKeyList(java.util.Arrays.asList("Bar_Code", "po_name", "isEnsure"), java.util.Arrays.asList(curBarcode, "Material_Supply", "1"))) + (GetProductOtherPoNotDepleteRepertory(curBarcode, po_name));
}