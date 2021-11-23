double effectiveDuration_s() {
    if ((this.realizedArrTime_s) > (this.realizedDptTime_s)) {
        return (this.realizedDptTime_s) + ((floetteroed.utilities.Units.S_PER_D) - (this.realizedArrTime_s));
    }else {
        return floetteroed.utilities.math.MathHelpers.overlap(this.realizedDptTime_s, this.realizedArrTime_s, ((this.plannedActivity.openingTime_s) != null ? this.plannedActivity.openingTime_s : java.lang.Double.NEGATIVE_INFINITY), ((this.plannedActivity.closingTime_s) != null ? this.plannedActivity.closingTime_s : java.lang.Double.POSITIVE_INFINITY));
    }
}