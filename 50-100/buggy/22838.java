@org.expath.ns.Test
public void geometryType() {
    org.expath.ns.GeoTest.run(("geo:geometryType(<gml:MultiPoint><gml:Point>" + (("<gml:coordinates>1,1</gml:coordinates></gml:Point>" + "<gml:Point><gml:coordinates>1,2</gml:coordinates></gml:Point>") + "</gml:MultiPoint>)")), "gml:MultiPoint");
    org.expath.ns.GeoTest.error("geo:geometryType(text {'srsName'})", org.expath.ns.INVCAST_X_X_X.qname());
    org.expath.ns.GeoTest.error("geo:geometryType(<gml:unknown/>)", org.expath.ns.GeoErrors.qname(1));
    org.expath.ns.GeoTest.error(("geo:geometryType(<gml:Point><gml:coordinates>1 2</gml:coordinates>" + "</gml:Point>)"), org.expath.ns.GeoErrors.qname(2));
}