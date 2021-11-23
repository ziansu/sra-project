public static org.nschmidt.csg.Polygon fromPoints(org.nschmidt.ldparteditor.data.GDataCSG csg, org.nschmidt.ldparteditor.data.DatFile df, org.nschmidt.csg.Vector3d... points) {
    return org.nschmidt.csg.Polygon.fromPoints(csg, df, new java.util.ArrayList<org.nschmidt.csg.Vector3d>(java.util.Arrays.asList(points)), new org.nschmidt.csg.PropertyStorage(), null);
}