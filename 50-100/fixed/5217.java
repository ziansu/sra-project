@org.expath.ns.Test
public void touches() {
    org.expath.ns.GeoTest.run(("geo:touches(<gml:MultiLineString><gml:LineString><gml:coordinates>" + ((("1,1 0,0 2,1</gml:coordinates></gml:LineString><gml:LineString>" + "<gml:coordinates>2,1 3,3 4,4</gml:coordinates></gml:LineString>") + "</gml:MultiLineString>, <gml:LineString><gml:coordinates>0,0 2,1 3,3") + "</gml:coordinates></gml:LineString>)")), "false");
    org.expath.ns.GeoTest.error("geo:touches(a, text {'a'})", org.expath.ns.NOCTX_X);
    org.expath.ns.GeoTest.error(("geo:touches(<gml:Point><gml:coordinates>10,10 12,11</gml:coordinates>" + ("</gml:Point>, <gml:LinearRing><gml:coordinates>1,1 2,1 5,3 1,1" + "</gml:coordinates></gml:LinearRing>)")), org.expath.ns.GeoErrors.qname(2));
    org.expath.ns.GeoTest.error(("geo:touches(<gml:Point><gml:coordinates>1,1</gml:coordinates>" + ("</gml:Point>, <gml:Line><gml:coordinates>0,0 2,1 3,3" + "</gml:coordinates></gml:Line>)")), org.expath.ns.GeoErrors.qname(1));
}