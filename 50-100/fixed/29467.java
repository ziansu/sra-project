protected void runSimulationInNewThread() {
    for (final java.util.Map.Entry<java.lang.Integer, org.lemsml.jlems.core.run.RunConfig> conf : runConfigs.entrySet()) {
        multiThreadService.execute(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                try {
                    simulation.run(conf.getValue(), false);
                } catch (java.lang.Exception ex) {
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), java.lang.String.format("Failed to run simulation : %s", ex.getMessage()), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}