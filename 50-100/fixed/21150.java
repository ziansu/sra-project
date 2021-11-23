double effectiveDuration_s() {
    final double result;
    if ((this.realizedArrTime_s) > (this.realizedDptTime_s)) {
        result = (this.realizedDptTime_s) + ((floetteroed.utilities.Units.S_PER_D) - (this.realizedArrTime_s));
    }else {
        result = floetteroed.utilities.math.MathHelpers.overlap(this.realizedArrTime_s, this.realizedDptTime_s, ((this.plannedActivity.openingTime_s) != null ? this.plannedActivity.openingTime_s : java.lang.Double.NEGATIVE_INFINITY), ((this.plannedActivity.closingTime_s) != null ? this.plannedActivity.closingTime_s : java.lang.Double.POSITIVE_INFINITY));
    }
    return result;
}