public void updateFromPeripheral(int newPressure, int irPoint, int redPoint) {
    updatePressure(newPressure);
    edu.odu.ece486.hm_app.ValsalvaDataHolder.irSignal.add(new java.lang.Double(((new java.lang.Double(irPoint)) / 65536)));
    edu.odu.ece486.hm_app.ValsalvaDataHolder.redSignal.add(new java.lang.Double(((new java.lang.Double(redPoint)) / 65536)));
    edu.odu.ece486.hm_app.ValsalvaDataHolder.lungPressureSignal.add(newPressure);
}