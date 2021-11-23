public java.lang.String getRealtimeJSONByTime(java.lang.String time) {
    return gson.toJson(com.taobao.rigel.rap.common.utils.SystemVisitorLog.getRealtimeMap(time));
}