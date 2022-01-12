public boolean isPrincipalGraceApplicableForThisPeriod(final int periodNumber) {
    if ((this.getRecurringMoratoriumOnPrincipalPeriods()) > 0) {
        return ((periodNumber > 0) && (periodNumber <= (getPrincipalGrace()))) || ((periodNumber > 0) && (((periodNumber - (getPrincipalGrace())) % ((this.getRecurringMoratoriumOnPrincipalPeriods()) + 1)) != 1));
    }else {
        return (periodNumber > 0) && (periodNumber <= (getPrincipalGrace()));
    }
}