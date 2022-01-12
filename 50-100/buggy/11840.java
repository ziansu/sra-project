public void createAccessToken(java.lang.String result) {
    com.alibaba.fastjson.JSONObject tmp = com.alibaba.fastjson.JSON.parseObject(result);
    if (result.contains("accessToken")) {
        setAccessToken(tmp.getString("access_token"));
    }else {
        setAccessToken(tmp.getString("component_access_token"));
    }
    setExpiresIn((((tmp.getLong("expires_in")) - 60) * 1000));
}