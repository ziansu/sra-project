@org.expath.ns.Test
public void asText() {
    org.expath.ns.GeoTest.run(("geo:asText(<gml:LineString><gml:coordinates>1,1 55,99 2,1" + "</gml:coordinates></gml:LineString>)"), "LINESTRING (1 1, 55 99, 2 1)");
    org.expath.ns.GeoTest.error("geo:asText(text {'a'})", org.expath.ns.INVCAST_X_X_X.qname());
    org.expath.ns.GeoTest.error("geo:asText(<gml:unknown/>)", org.expath.ns.GeoErrors.qname(1));
    org.expath.ns.GeoTest.error(("geo:asText(<gml:LineString><gml:coordinates>1,1</gml:coordinates>" + "</gml:LineString>)"), org.expath.ns.GeoErrors.qname(2));
}