public java.util.List<com.xz.data.prepare.RawData> fetchData(com.xz.data.syntax.TqlEntity tqlEntity, com.xz.data.syntax.TqlInterval tqlInterval) {
    java.util.List<com.xz.data.prepare.RawData> result = com.google.common.collect.Lists.newArrayList();
    for (int i = 1; i < 4; ++i) {
        result.add(new com.xz.data.prepare.RawData(i, null));
    }
    return result;
}