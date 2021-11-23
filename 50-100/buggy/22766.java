public double downFunctionRespirationRate() {
    double result;
    result = 1 - (0.001 * (java.lang.Math.pow(1, 2)));
    double currentRespirationRate = patient.getRepirationRate().getRrNum();
    double resultRespirationRate = currentRespirationRate * result;
    if (resultRespirationRate < 10) {
        resultRespirationRate = 10;
    }else {
    }
    this.patient.setRespirationRate(new edu.cmu.lti.bic.sbs.simulator.RespirationRate(resultRespirationRate));
    return result;
}