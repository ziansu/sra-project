private <T> void check(net.serenitybdd.screenplay.Consequence<T> consequence, net.serenitybdd.screenplay.ErrorTally errorTally) {
    try {
        eventBusInterface.startQuestion(net.serenitybdd.screenplay.formatting.FormattedTitle.ofConsequence(consequence));
        if (eventBusInterface.shouldIgnoreConsequences()) {
            net.thucydides.core.steps.StepEventBus.getEventBus().stepIgnored();
        }else {
            consequence.evaluateFor(this);
        }
        eventBusInterface.reportStepFinished();
    } catch (net.serenitybdd.screenplay.exceptions.IgnoreStepException e) {
        eventBusInterface.reportStepIgnored();
    } catch (java.lang.Throwable e) {
        errorTally.recordError(consequence, e);
    }
}