@org.expath.ns.Test
public void equals() {
    org.expath.ns.GeoTest.run(("geo:equals(<gml:LinearRing><gml:coordinates>1,1 2,1 5,3 1,1" + ((("</gml:coordinates></gml:LinearRing>, " + "<gml:Polygon><gml:outerBoundaryIs><gml:LinearRing>") + "<gml:coordinates>1,1 2,1 5,3 1,1</gml:coordinates></gml:LinearRing>") + "</gml:outerBoundaryIs></gml:Polygon>)")), "false");
    org.expath.ns.GeoTest.error("geo:equals(text {'a'}, a)", org.expath.ns.NOCTX_X.qname());
    org.expath.ns.GeoTest.error(("geo:equals(<gml:unknown/>, <gml:LinearRing><gml:coordinates>" + "1,1 2,1 5,3 1,1</gml:coordinates></gml:LinearRing>)"), org.expath.ns.GeoErrors.qname(1));
    org.expath.ns.GeoTest.error(("geo:equals(<gml:LinearRing><gml:coordinates>1,1 55,99 2,1" + (("</gml:coordinates></gml:LinearRing>," + "<gml:LineString><gml:coordinates>1,1 55,99 2,1") + "</gml:coordinates></gml:LineString>)")), org.expath.ns.GeoErrors.qname(2));
}