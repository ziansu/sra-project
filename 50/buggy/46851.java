public static lion.rockwheel.model.DeviceInfo getLastInfo() {
    return (lion.rockwheel.helpers.DbHelper.lastInfo) != null ? lion.rockwheel.helpers.DbHelper.lastInfo : new lion.rockwheel.model.DeviceInfo();
}