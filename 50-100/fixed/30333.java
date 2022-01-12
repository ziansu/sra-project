@org.junit.Test
public void testMinOccurFilter() throws java.lang.Exception {
    org.auscope.portal.mineraloccurrence.MineralTenementFilter filter = new org.auscope.portal.mineraloccurrence.MineralTenementFilter("abc", "def", "ghi", "jkl", "mno");
    java.lang.String result = filter.getFilterStringAllRecords();
    org.w3c.dom.Document doc = org.auscope.portal.server.domain.ogc.AbstractFilterTestUtilities.parsefilterStringXML(result);
    org.auscope.portal.server.domain.ogc.AbstractFilterTestUtilities.runNodeSetValueCheck(doc, "/descendant::ogc:PropertyIsLike/ogc:Literal", new java.lang.String[]{ "abc" , "def" , "ghi" }, 3);
}