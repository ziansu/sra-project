private au.com.mutopia.acs.models.c3ml.C3mlEntity buildEntity(de.micromata.opengis.kml.v_2_2_0.Document document) throws au.com.mutopia.acs.exceptions.ConversionException {
    au.com.mutopia.acs.models.c3ml.C3mlEntity entity = createEntity(document);
    java.util.List<de.micromata.opengis.kml.v_2_2_0.Feature> features = document.getFeature();
    for (de.micromata.opengis.kml.v_2_2_0.Feature feature : features) {
        au.com.mutopia.acs.models.c3ml.C3mlEntity child = buildEntity(feature);
        entity.addChild(child);
    }
    return entity;
}