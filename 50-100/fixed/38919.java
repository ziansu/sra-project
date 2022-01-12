public static ro.esock.model.filter.SearchProductFilter convertSearchProductFilterXmlToSearchProductFilter(ro.esock.ws.soap.product.SearchProductFilterXml xml) {
    ro.esock.model.filter.SearchProductFilter filter = new ro.esock.model.filter.SearchProductFilter();
    if (xml != null) {
        filter.setPriceMax(xml.getPriceMax());
        filter.setPriceMin(xml.getPriceMin());
        if ((xml.getKeywords()) != null) {
            filter.setKeywords(new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(xml.getKeywords().split(" "))));
        }
    }
    return filter;
}