@server.RequestMapping(value = "/endOfStudy")
public java.lang.String endOfStudy(@server.RequestParam(value = "deviceid")
java.lang.String deviceId) {
    deviceId = deviceId.trim();
    java.util.Date endOfStudy = server.database.DataAccess.getEndOfStudyWithDeviceId(deviceId);
    java.lang.String endOfStudyAsString = endOfStudy.toString();
    return endOfStudyAsString;
}