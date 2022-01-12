private void loadMapperFromJson(java.lang.String path, java.lang.String jsonText, java.util.Map<java.lang.String, java.lang.String> globalVar) throws java.io.IOException {
    org.pinae.timon.io.SqlMapper mapper = new org.pinae.timon.io.SqlMapper();
    try {
        mapper = com.alibaba.fastjson.JSON.parseObject(jsonText, org.pinae.timon.io.SqlMapper.class);
        build(path, mapper, globalVar);
    } catch (java.lang.Exception e) {
        throw new java.io.IOException(e);
    }
}