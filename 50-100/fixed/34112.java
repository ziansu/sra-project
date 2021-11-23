private java.util.ArrayList<com.sina.util.dnscache.model.IpModel> filterInvalidIp(java.util.ArrayList<com.sina.util.dnscache.model.IpModel> ipModelArr) {
    java.util.ArrayList<com.sina.util.dnscache.model.IpModel> result = new java.util.ArrayList<com.sina.util.dnscache.model.IpModel>();
    for (int i = 0; i < (ipModelArr.size()); i++) {
        com.sina.util.dnscache.model.IpModel ipModel = ipModelArr.get(i);
        if (!(("" + (com.sina.util.dnscache.speedtest.SpeedtestManager.MAX_OVERTIME_RTT)).equals(ipModel.rtt))) {
            result.add(ipModel);
        }
    }
    return result;
}