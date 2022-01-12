public synchronized void updateStatus() {
    replicatorg.util.Point5d current = machine.getDriverQueryInterface().getCurrentPosition(true);
    for (replicatorg.machine.model.AxisId axis : machine.getModel().getAvailableAxes()) {
        double v = current.axis(axis);
        positionFields.get(axis).setText(positionFormatter.format(v));
    }
}