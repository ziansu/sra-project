public double downFunctionBloodPressure() {
    double result;
    result = 1 - (0.001 * (java.lang.Math.pow(1, 2)));
    double currentSystolicBloodPressure = patient.getBloodPressure().getSystolicBloodPressure();
    double currentDiastolicBloodPressure = patient.getBloodPressure().getDiastolicBloodPressure();
    java.lang.System.out.println(("currentSystolicBloodPressure = " + currentSystolicBloodPressure));
    java.lang.System.out.println(("currentDiastolicBloodPressure = " + currentDiastolicBloodPressure));
    this.patient.setBloodPressure(new edu.cmu.lti.bic.sbs.simulator.BloodPressure((currentSystolicBloodPressure * result), (currentDiastolicBloodPressure * result)));
    return result;
}