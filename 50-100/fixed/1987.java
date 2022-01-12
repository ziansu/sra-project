public org.wso2.siddhi.core.event.in.InEvent[] curvePredictor(org.wso2.siddhi.core.event.in.InEvent firstEvent) {
    findEMA();
    org.apache.stratos.cep.extension.CurveFitter curveFitter = new org.apache.stratos.cep.extension.CurveFitter(timeStamps, smoothedValues);
    double[] coefficients = curveFitter.fit();
    org.wso2.siddhi.core.event.in.InEvent[] inEvents = new org.wso2.siddhi.core.event.in.InEvent[3];
    return inEvents;
}