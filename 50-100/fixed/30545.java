private void sendCommand(final java.lang.String cmd) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                controller.sendString(cmd);
            } catch (java.lang.Exception e) {
                android.util.Log.w(de.hhn.munz.ardrone2.ControlActivity.TAG, e.getMessage());
            }
        }
    }).start();
}