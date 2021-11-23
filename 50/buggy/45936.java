@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("btnIncTemp pressed");
    com.hummingbee.ui.MainUI.UserInterface.getInstance().getGarden().incrementTemperature();
    lblTemp.setText(com.hummingbee.ui.ControlPanel.getTemperatureFormatter(com.hummingbee.system.Garden.getTemperature()));
}