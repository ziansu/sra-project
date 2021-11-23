private void intit() {
    formatCheckQueue = new ui.common.checkFormat.FormatCheckQueue();
    formatCheckQueue.addTasker(new ui.common.checkFormat.field.CheckCarIDTasker(null, carID_Field), new ui.common.checkFormat.field.CheckIsNullTasker(chassisID_Field), new ui.common.checkFormat.field.CheckIsNullTasker(engineID_Field), new ui.common.checkFormat.field.CheckIsNullTasker(nameID_Field));
}