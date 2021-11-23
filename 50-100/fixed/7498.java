public java.util.HashMap<java.lang.String, double[]> fetchTrace(int channelNumber) {
    this.fetchChannel(channelNumber);
    java.util.HashMap<java.lang.String, double[]> retData = new java.util.HashMap<>();
    retData.put("x", this.aChannels.get((channelNumber - 1)).getXAxis());
    retData.put("y", this.aChannels.get((channelNumber - 1)).getYAxis());
    return retData;
}