void unpaintMill() throws java.lang.InterruptedException {
    c.runOnUiThread(new java.lang.Runnable() {
        public void run() {
            fieldLayout.removeView(millSectors[0]);
            fieldLayout.removeView(millSectors[1]);
            fieldLayout.removeView(millSectors[2]);
            signalUIupdate();
        }
    });
}