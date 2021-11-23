public static void main(java.lang.String[] args) {
    try {
        dashnet.Client client = new dashnet.Client();
        dashnet.SysInfo sys = new dashnet.SysInfo();
        java.lang.String data = sys.getSysInfo();
        client.sendInfo(data);
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(("EX = " + ex));
        java.util.logging.Logger.getLogger(dashnet.DashNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}