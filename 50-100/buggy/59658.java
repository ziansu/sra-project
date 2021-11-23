private void deleteMachine(org.icatproject.topcatdaaasplugin.database.entities.Machine machine, java.lang.String state) {
    try {
        org.icatproject.topcatdaaasplugin.MachinePool.logger.info("Deleting machine {}", machine.getId());
        cloudClient.deleteServer(machine.getId());
        machine.setState(state);
        database.persist(machine);
    } catch (java.lang.Exception e) {
        org.icatproject.topcatdaaasplugin.MachinePool.logger.error("Failed to delete machine: {}", e.getMessage());
        e.printStackTrace();
    }
}