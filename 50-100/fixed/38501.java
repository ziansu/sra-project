public static void runS() {
    org.broad.igv.ui.ShutdownThread.log.info("Shutting down");
    org.broad.igv.dev.db.DBManager.shutdown();
    org.broad.igv.batch.CommandListener.halt();
    at.ccri.varan.GIE.getInstance().close();
    if (org.broad.igv.ui.IGV.hasInstance()) {
        org.broad.igv.ui.IGV.getInstance().saveStateForExit();
        for (org.broad.igv.track.Track t : org.broad.igv.ui.IGV.getInstance().getAllTracks()) {
            t.dispose();
        }
    }
}