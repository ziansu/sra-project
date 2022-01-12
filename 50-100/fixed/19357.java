public double downFunctionBloodPressure() {
    double result;
    result = 1 - (0.001 * (java.lang.Math.pow(1, 2)));
    double currentSystolicBloodPressure = patient.getBloodPressure().getSystolicBloodPressure();
    double currentDiastolicBloodPressure = patient.getBloodPressure().getDiastolicBloodPressure();
    this.patient.setBloodPressure(new edu.cmu.lti.bic.sbs.simulator.BloodPressure((currentSystolicBloodPressure * result), (currentDiastolicBloodPressure * result)));
    return result;
}