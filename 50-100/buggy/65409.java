@java.lang.Override
public void remove(org.geogebra.common.kernel.geos.GeoElement output) {
    for (int i = 0; i < (points.length); i++) {
        if (((points[i]) == output) && (!(points[i].isDefined()))) {
            removePoint(i);
            return ;
        }
    }
    super.remove();
}