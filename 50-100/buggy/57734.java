@org.expath.ns.Test
public void dimension() {
    org.expath.ns.GeoTest.run(("geo:dimension(" + "<gml:Point><gml:coordinates>1,2</gml:coordinates></gml:Point>)"), "0");
    org.expath.ns.GeoTest.error("geo:dimension(text {'a'})", org.expath.ns.INVCAST_X_X_X.qname());
    org.expath.ns.GeoTest.error("geo:dimension(<gml:unknown/>)", org.expath.ns.GeoErrors.qname(1));
    org.expath.ns.GeoTest.error(("geo:dimension(<gml:Point>" + "<gml:coordinates>1 2</gml:coordinates></gml:Point>)"), org.expath.ns.GeoErrors.qname(2));
}