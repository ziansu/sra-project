private java.util.EnumMap<com.dps.web.service.controller.ProductController.UploadFields, java.lang.Object> getRowData(java.util.Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator, java.util.Map<java.lang.Integer, com.dps.web.service.controller.ProductController.UploadFields> uploadFieldsMap) {
    java.util.EnumMap<com.dps.web.service.controller.ProductController.UploadFields, java.lang.Object> map = new java.util.EnumMap<>(com.dps.web.service.controller.ProductController.UploadFields.class);
    int cellCount = 0;
    while (cellCount < (com.dps.web.service.controller.ProductController.UploadFields.values().length)) {
        org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
        com.dps.web.service.controller.ProductController.UploadFields uf = uploadFieldsMap.get((cellCount++));
        map.put(uf, getCellData(cell));
    } 
    return map;
}