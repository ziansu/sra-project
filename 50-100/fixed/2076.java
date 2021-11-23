public org.locationtech.geomesa.api.GeoMesaQuery build() {
    org.locationtech.geomesa.api.GeoMesaQuery query = new org.locationtech.geomesa.api.GeoMesaQuery();
    query.filter = org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.and(org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.bbox("geom", minx, miny, maxx, maxy, "EPSG:4326"), org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.between(org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.property("dtg"), org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.literal(start), org.locationtech.geomesa.api.GeoMesaQuery.GeoMesaQueryBuilder.ff.literal(end)));
    return query;
}