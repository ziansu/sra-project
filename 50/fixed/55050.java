public static java.lang.Double dayMoney(java.lang.String record) {
    com.alibaba.fastjson.JSONObject jo = com.alibaba.fastjson.JSONObject.parseObject(record);
    return ((jo.getDouble("price")) * (jo.getDouble("smoke"))) / 20.0;
}