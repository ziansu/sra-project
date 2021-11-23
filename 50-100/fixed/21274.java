public void updateData(int param) {
    todayStepNum = param;
    textStepNum.setText((param + "步"));
    Step2Energy(param);
    Step2Distance(param);
    textEnergy.setText(((decimalFormat.format(this.energy)) + "大卡"));
    textDistance.setText(((decimalFormat.format(this.distance)) + "km"));
    setSpeed(param);
    setStatus(this.speed);
}