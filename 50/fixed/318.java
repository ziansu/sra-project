protected void undo(com.ra4king.circuitsim.gui.CircuitManager manager, java.lang.Object[] params) {
    manager.getSimulatorWindow().deleteCircuit(manager, true, false);
}