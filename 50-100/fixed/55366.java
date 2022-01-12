public void validate() throws com.touzhijia.platform.service.PlatformException {
    if (((index) == null) && ((timeRange) == null)) {
        throw new com.touzhijia.platform.service.PlatformException(101, "参数有误");
    }
    if (((timeRange) != null) && (timeRange.startTime.after(timeRange.endTime))) {
        throw new com.touzhijia.platform.service.PlatformException(101, "参数有误");
    }
}