public boolean isPrincipalGraceApplicableForThisPeriod(final int periodNumber) {
    return ((periodNumber > 0) && (periodNumber <= (getPrincipalGrace()))) || ((periodNumber > 0) && (((periodNumber - (getPrincipalGrace())) % ((this.getRecurringMoratoriumOnPrincipalPeriods()) + 1)) != 1));
}