public static void init() throws java.beans.PropertyVetoException {
    com.wireless.db.DBCon.init("192.168.33.100", "3306", "wireless_order_db", "root", "HelloZ315");
    OssImage.Params.init("digie-image-test", com.wireless.pojo.oss.OSSParams.init("KMLtoTwkG5Jqaapu", "VZtrdLaO6WFcJQrvffO9XBPVpbKGRP", "oss.aliyuncs.com", "oss.aliyuncs.com"));
    com.wireless.sccon.ServerConnector.instance().setMaster(new com.wireless.sccon.ServerConnector.Connector("localhost", 55555));
}