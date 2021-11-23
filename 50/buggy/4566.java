private void loginViaVirdi() {
    com.dmrr.asistenciasx.VirdiFingerPrintSensor sensor = new com.dmrr.asistenciasx.VirdiFingerPrintSensor();
    sensor.preparaEngine(profesorList);
    sensor.esperaPorHuella(canvas, jTextArea1, this);
}