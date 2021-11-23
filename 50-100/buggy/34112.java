private java.util.ArrayList<com.sina.util.dnscache.model.IpModel> filterInvalidIp(java.util.ArrayList<com.sina.util.dnscache.model.IpModel> ipModelArr) {
    java.util.ArrayList<com.sina.util.dnscache.model.IpModel> result = new java.util.ArrayList<com.sina.util.dnscache.model.IpModel>();
    for (com.sina.util.dnscache.model.IpModel ipModel : ipModelArr) {
        if (!(("" + (com.sina.util.dnscache.speedtest.SpeedtestManager.MAX_OVERTIME_RTT)).equals(ipModel.rtt))) {
            result.add(ipModel);
        }
    }
    return result;
}