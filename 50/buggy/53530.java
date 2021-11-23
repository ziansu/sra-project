public int getInteger(org.p2p.lending.club.api.data.impl.EnumNote enumNote) {
    java.lang.Object val = fieldsMap.get(enumNote.name());
    return val == null ? null : ((int) (val));
}