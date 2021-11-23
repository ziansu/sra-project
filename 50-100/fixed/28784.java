@org.springframework.web.bind.annotation.RequestMapping(value = "playUrl", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json; charset=utf-8")
@org.springframework.web.bind.annotation.ResponseBody
public com.xxl.job.core.biz.model.ReturnT<com.alibaba.fastjson.JSONArray> playUrl(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "uid")
java.lang.String uid) {
    com.alibaba.fastjson.JSONObject jsonObject1 = com.alibaba.fastjson.JSONObject.parseObject(uid);
    long id = jsonObject1.getLongValue("uid");
    java.lang.String result = com.xxl.job.admin.util.NetEaseClient.getPlayUrl(id);
    com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSONObject.parseObject(result);
    com.alibaba.fastjson.JSONArray jsonArray = jsonObject.getJSONArray("data");
    return new com.xxl.job.core.biz.model.ReturnT(jsonArray);
}