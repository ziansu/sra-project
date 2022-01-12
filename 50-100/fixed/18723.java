public static boolean isCompatible(org.locationtech.udig.project.ILayer layer, java.util.List<?> geometries) {
    if ((layer == null) || ((layer.getSchema()) == null)) {
        return false;
    }
    java.lang.Class<?> type = layer.getSchema().getGeometryDescriptor().getType().getBinding();
    return geometries.contains(type);
}