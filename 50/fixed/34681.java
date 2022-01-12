private static void removeType(com.alibaba.fastjson.JSONObject object) {
    if ((object.containsKey("className")) && (object.containsKey(cn.leancloud.ResponseUtil.TYPE))) {
        object.remove("className");
        object.remove(cn.leancloud.ResponseUtil.TYPE);
    }
}