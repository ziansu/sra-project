private void updateComponentTreeUI() {
    javax.swing.SwingUtilities.updateComponentTreeUI(myMainFrame);
    myMainFrame.pack();
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            for (java.lang.Runnable r : myOnUpdateComponentTreeUiCallbacks) {
                r.run();
            }
            getGanttChart().reset();
            getResourceChart().reset();
        }
    });
}