private void onceWrite(org.poco.framework.poi.managers.IPoiManager.IPoiSheet sheet, java.util.List<org.poco.framework.poi.managers.impl.ReadWriter.XMLDetail> onces, java.lang.Object data) {
    java.lang.Object param = null;
    for (org.poco.framework.poi.managers.impl.ReadWriter.XMLDetail xdetail : onces) {
        param = org.poco.framework.poi.utils.PropertyUtil.getValue(data, xdetail.name);
        if (param == null)
            continue;
        
        for (org.poco.framework.poi.managers.impl.ReadWriter.XMLCell xcell : xdetail.cells) {
            java.lang.Object value = org.poco.framework.poi.utils.PropertyUtil.getValue(param, xcell.name);
            if (value == null)
                continue;
            
            cellWrite(sheet, xcell, value, null);
        }
    }
}