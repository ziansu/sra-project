public double getVoltage(java.lang.String channelName, java.lang.Integer sample) {
    this.voltmeterAutoRange(channelName);
    return this.getAverageVoltage(channelName, sample);
}