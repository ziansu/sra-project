public static boolean createConnection(java.lang.String ip) {
    source.ConnectionManager c = new source.ConnectionManager(ip);
    try {
        source.DataTurbineSource.s = c.connect();
        source.DataTurbineSource.SH = new source.SensorHandler(source.DataTurbineSource.s);
        c.start();
    } catch (com.rbnb.sapi.SAPIException | java.io.IOException ex) {
        java.util.logging.Logger.getLogger(source.DataTurbineSource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        return false;
    }
    return true;
}