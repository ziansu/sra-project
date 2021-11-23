@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    parking.house.gui.AddVehicleDialog dialog = new parking.house.gui.AddVehicleDialog(shell);
    dialog.open();
    parking.house.model.Vehicle v = dialog.getVehicle();
    if (v != null) {
        java.lang.System.out.println(("Choosed vehicle:" + v));
        setValue(v);
    }
}