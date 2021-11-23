public java.lang.String getRealtimeJSONByTime(int time) {
    return gson.toJson(com.taobao.rigel.rap.common.utils.SystemVisitorLog.getRealtimeMap(time));
}