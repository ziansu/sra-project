private void onInit() {
    getcountry();
    com.softwinner.update.UpdaterInfo.updating_apk_version = getVersionCode();
    com.softwinner.update.UpdaterInfo.brand = com.softwinner.update.UpdaterInfo.getString("ro.product.brand");
    com.softwinner.update.UpdaterInfo.device = com.softwinner.update.UpdaterInfo.getString("ro.product.device");
    com.softwinner.update.UpdaterInfo.board = com.softwinner.update.UpdaterInfo.getString("ro.product.board");
    com.softwinner.update.UpdaterInfo.firmware = com.softwinner.update.UpdaterInfo.getString("ro.product.firmware");
    com.softwinner.update.UpdaterInfo.android = com.softwinner.update.UpdaterInfo.getString("ro.build.version.release");
    com.softwinner.update.UpdaterInfo.time = com.softwinner.update.UpdaterInfo.getString("ro.build.date.utc");
    com.softwinner.update.UpdaterInfo.builder = com.softwinner.update.UpdaterInfo.getString("ro.build.user");
    com.softwinner.update.UpdaterInfo.fingerprint = com.softwinner.update.UpdaterInfo.getString("ro.build.fingerprint");
}