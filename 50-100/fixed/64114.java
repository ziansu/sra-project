public java.util.ArrayList<tools.descartes.dlim.generator.ArrivalRateTuple> evaluateForTimeStampsSequentially(double startTime, double endTime, double step) {
    java.util.ArrayList<tools.descartes.dlim.generator.ArrivalRateTuple> tuples = new java.util.ArrayList<tools.descartes.dlim.generator.ArrivalRateTuple>();
    for (double time = startTime; time < endTime; time += step) {
        double y = evaluator.getArrivalRateAtTime(time);
        max = java.lang.Math.max(y, max);
        tuples.add(new tools.descartes.dlim.generator.ArrivalRateTuple(time, y));
    }
    return tuples;
}