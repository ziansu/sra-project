@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (updateGuiVariables()) {
        java.util.concurrent.ExecutorService es = java.util.concurrent.Executors.newCachedThreadPool();
        es.execute(new ct.vss.Registration.track3D(gui_selectedTrack, 1, gui_dz, gui_pStackRadii, gui_pCenterOfMassRadii, gui_bg, gui_iterations));
        try {
            es.shutdown();
            while (!(es.awaitTermination(1, java.util.concurrent.TimeUnit.MINUTES)));
        } catch (java.lang.InterruptedException ex) {
            java.lang.System.err.println("tasks interrupted");
        }
    }
}