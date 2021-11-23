@server.RequestMapping(value = "/endOfStudy")
public java.lang.String endOfStudy(@server.RequestParam(value = "deviceid")
java.lang.String deviceId) {
    deviceId = deviceId.trim();
    java.lang.String endOfStudy = server.database.DataAccess.getEndOfStudyWithDeviceId(deviceId);
    return endOfStudy;
}