@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(RMOS.getMachines().isEmpty())) {
        Recycling.RecyclingData.RecyclingMachine RCM = selectedRCM();
        RMOS.removeMachineWithID(RCM.getID());
        RMOS.saveStatus();
        try {
            updateMachineStats();
            updateGlobalStats();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        updateRCMList();
        updateButtonPanel();
        updateRCMPanel();
    }
}