public void setConsumptionValue(int value, com.freedomotic.model.ds.Config params, boolean fireCommand) {
    if (fireCommand) {
        com.freedomotic.things.impl.ElectricDevice.LOG.log(java.util.logging.Level.WARNING, ("Power consumption behavior of thing ''{0}''" + (" is supposed to be a read only value. " + "No command is executed!")), this.getPojo().getName());
    }else {
        consumption.setValue(value);
        setChanged(true);
    }
}