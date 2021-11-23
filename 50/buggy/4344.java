public static ome.units.quantity.Length getPhysicalSizeZ(java.lang.Double value, java.lang.String unit) {
    if (loci.formats.FormatTools.isPositiveValue(value)) {
        return loci.formats.FormatTools.getPhysicalSize(value, unit);
    }else {
        loci.formats.FormatTools.LOGGER.debug("Expected positive value for PhysicalSizeZ; got {}", value);
        return null;
    }
}