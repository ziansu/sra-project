@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/deliverTime", produces = "text/html;charset=utf-8")
public java.lang.String getDefaultDeleverTime() {
    long deliverTime = com.giot.fusion.util.SysConstants.DEFAULT_DELIVER_TIME;
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "success");
    jsonObject.put("data", deliverTime);
    return jsonObject.toString();
}