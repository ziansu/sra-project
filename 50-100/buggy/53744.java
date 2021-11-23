public void updateInfo() {
    renderText[0] = obj.getSensorname();
    renderText[1] = obj.getController().getSite().getSitename();
    renderText[2] = ((((((obj.getMinthreshold()) + ";") + (obj.getMaxthreshold())) + ";") + (DatabaseReading.SensorLastReading.getOrDefault(obj, 0.0))) + ";") + (obj.getUnit());
}