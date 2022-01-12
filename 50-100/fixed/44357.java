public com.vistatec.ocelot.lqi.model.LQIGrid readLQIGridConfiguration() {
    com.vistatec.ocelot.lqi.model.LQIGrid lqiGrid = null;
    try {
        lqiGrid = configService.readLQIConfig();
        if (lqiGrid.isEmpty()) {
            lqiGrid = com.vistatec.ocelot.lqi.constants.LQIConstants.getDefaultLQIGrid();
        }
    } catch (com.vistatec.ocelot.config.ConfigTransferService.TransferException e) {
        logger.error("Error while reading the LQI grid configuration", e);
        javax.swing.JOptionPane.showMessageDialog(ocelotMainFrame, "An error has occurred while reading the LQI grid configuration", "LQI Grid Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    return lqiGrid;
}