@org.expath.ns.Test
public void isSimple() {
    org.expath.ns.GeoTest.run(("geo:isSimple(<gml:LineString><gml:coordinates>1,1 20,1 10,4 20,-10" + "</gml:coordinates></gml:LineString>)"), "false");
    org.expath.ns.GeoTest.error("geo:isSimple(text {'a'})", org.expath.ns.INVCAST_X_X_X.qname());
    org.expath.ns.GeoTest.error("geo:isSimple(<gml:unknown/>)", org.expath.ns.GeoErrors.qname(1));
    org.expath.ns.GeoTest.error(("geo:isSimple(<gml:LinearRing><gml:coordinates>1,1 55,99 2,1" + "</gml:coordinates></gml:LinearRing>)"), org.expath.ns.GeoErrors.qname(2));
}