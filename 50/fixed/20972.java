public double getDouble(org.p2p.lending.club.api.data.impl.EnumNote enumNote) {
    java.lang.Object val = fieldsMap.get(enumNote.value());
    return val == null ? null : ((double) (val));
}