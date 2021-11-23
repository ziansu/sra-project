public static void refresh() {
    if ((Chi.FrameActuatorManagement.currInstance) != null) {
        Chi.FrameActuatorManagement.currInstance.updateActuatorTable();
        Chi.FrameActuatorManagement.currInstance.table.repaint();
    }
}