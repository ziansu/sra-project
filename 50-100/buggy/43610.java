public void run() {
    if ((bt_conn) == true) {
        while (true) {
            try {
                mdluex.smartx.SplashScreen.serial_msg = java.lang.Integer.parseInt(new java.lang.String(java.lang.String.valueOf(mdluex.smartx.SplashScreen.inputStream.read())));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            ActivityControlCenter.read_msg = java.lang.String.valueOf(((char) (mdluex.smartx.SplashScreen.serial_msg)));
        } 
    }
}