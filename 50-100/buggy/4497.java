private static java.util.List<onefengma.demo.server.model.metaData.City> initCities() {
    if ((onefengma.demo.server.config.MetaDataHelper.CITIES) != null) {
        return onefengma.demo.server.config.MetaDataHelper.CITIES;
    }
    try {
        java.lang.String cityFiles = org.apache.commons.io.FileUtils.readFileToString(new java.io.File(((onefengma.demo.server.config.Config.getBaseMetaPath()) + "citys.json")), "utf-8");
        java.util.List<onefengma.demo.server.model.metaData.City> cities = com.alibaba.fastjson.JSON.parseArray(cityFiles, onefengma.demo.server.model.metaData.City.class);
        return cities;
    } catch (java.lang.Exception e) {
        onefengma.demo.server.core.LogUtils.e(e, "error when load cities");
        return java.util.Arrays.asList();
    }
}