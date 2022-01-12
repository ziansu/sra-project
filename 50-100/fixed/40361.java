protected java.lang.Double[] getUnitValues() {
    switch (mConverterType) {
        case AREA :
            return getUnitValues(R.array.area_units);
        case BYTES :
            return getUnitValues(R.array.bytes_units);
        case DENSITY :
            return getUnitValues(R.array.density_units);
        case LENGTH :
            return getUnitValues(R.array.length_units);
        case MASS :
            return getUnitValues(R.array.mass_units);
        case TIME :
            return getUnitValues(R.array.time_units);
        case VOLUME :
            return getUnitValues(R.array.volume_units);
        default :
            throw new java.lang.IllegalArgumentException(("Unknown converter type: " + (mConverterType)));
    }
}