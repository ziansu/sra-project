public java.lang.String getOutput(com.gtp.dubbo.api.metadata.ApiParamInfo returnParams) {
    if (returnParams.getIsList()) {
        com.alibaba.fastjson.JSONObject returnJson = com.gtp.dubbo.api.utils.ReflectUtils.allFields(returnParams.getType());
        com.alibaba.fastjson.JSONArray returnData = new com.alibaba.fastjson.JSONArray();
        returnData.add(returnJson);
        return returnData.toJSONString();
    }else {
        com.alibaba.fastjson.JSONObject returnJson = com.gtp.dubbo.api.utils.ReflectUtils.allFields(returnParams.getType());
        return returnJson.toJSONString();
    }
}