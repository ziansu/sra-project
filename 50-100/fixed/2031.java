public void announceObservedValues(org.openda.model_bmi.IObservationDescriptions observationDescriptions) {
    org.openda.model_bmi.ITime[] selectedTimes = observationDescriptions.getTimes();
    if ((selectedTimes == null) || ((selectedTimes.length) == 0)) {
        return ;
    }
    try {
        if ((bufferedExchangeItems) != null) {
            bufferedExchangeItems.clear();
        }
        bufferedExchangeItems = createBufferedExchangeItems(selectedTimes);
    } catch (bmi.BMIModelException e) {
        throw new java.lang.RuntimeException(((getClass().getSimpleName()) + ": Cannot retrieve selected times from announced observations."));
    }
}