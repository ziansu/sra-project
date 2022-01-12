private void initBound() {
    edu.cmu.lti.bic.sbs.simulator.Simulator.lowerBoundDict.put("respirationRate", 0.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.upperBoundDict.put("respirationRate", 20.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.lowerBoundDict.put("heartRate", 50.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.upperBoundDict.put("heartRate", 120.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.lowerBoundDict.put("diastolicBloodPressure", 40.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.upperBoundDict.put("diastolicBloodPressure", 100.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.lowerBoundDict.put("systolicBloodPressure", 70.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.upperBoundDict.put("systolicBloodPressure", 190.0);
    edu.cmu.lti.bic.sbs.simulator.Simulator.lowerBoundDict.put("oxygenLevel", 0.6);
    edu.cmu.lti.bic.sbs.simulator.Simulator.upperBoundDict.put("oxygenLevel", 1.0);
}