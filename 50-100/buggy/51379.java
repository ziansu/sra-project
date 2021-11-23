private java.util.List<com.xz.data.prepare.RawData> mockList(int size) {
    com.xz.data.prepare.RawData rawData = new com.xz.data.prepare.RawData(data);
    java.util.List<com.xz.data.prepare.RawData> rst = com.google.common.collect.Lists.newArrayList();
    for (int i = 0; i < size; ++i) {
        rst.add(rawData);
    }
    return rst;
}