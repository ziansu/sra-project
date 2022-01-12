void paintMill(final com.github.aedge90.nmm.Position[] mill) throws java.lang.InterruptedException {
    c.runOnUiThread(new java.lang.Runnable() {
        public void run() {
            for (int i = 0; i < 3; i++) {
                millSectors[i] = createSector(Options.Color.RED, mill[i].getX(), mill[i].getY());
                fieldLayout.addView(millSectors[i]);
            }
            signalUIupdate();
        }
    });
}