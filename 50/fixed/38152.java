public void caseLostCarSituationSuccess() {
    playHandler.removeMessages(1);
    if ((dialog_tv_status) != null) {
        dialog_tv_status.setText("设备在室外,定位成功");
    }
    status_GPSornot = "设备在室外,定位成功";
    setLostCarSituationFlag();
}