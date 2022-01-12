public static com.xck.modules.weather.entity.BasicCity mappingBasicCity(net.sf.json.JSONObject jsonObj) {
    com.xck.modules.weather.entity.BasicCity basicCity = new com.xck.modules.weather.entity.BasicCity();
    net.sf.json.JSONObject basicObj = jsonObj.getJSONObject("basic");
    basicCity.setId(com.xck.modules.weather.utils.WeatherUtils.checkJSONNodeString(basicObj, "id"));
    basicCity.setCity(com.xck.modules.weather.utils.WeatherUtils.checkJSONNodeString(basicObj, "city"));
    basicCity.setCnty(com.xck.modules.weather.utils.WeatherUtils.checkJSONNodeString(basicObj, "cnty"));
    basicCity.setProv(com.xck.modules.weather.utils.WeatherUtils.checkJSONNodeString(basicObj, "prow"));
    return basicCity;
}