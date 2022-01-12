public com.mockneat.mock.unit.objects.Probabilities<T> add(java.lang.Double prob, com.mockneat.mock.interfaces.MockUnit<T> mock) {
    double lastVal = lastVal();
    double toAdd = lastVal + prob;
    org.apache.commons.lang3.Validate.isTrue((!((lastVal + prob) > 1.0)), com.mockneat.mock.utils.ValidationUtils.PROBABILITIES_SUM_BIGGER);
    probs.add(com.mockneat.types.Pair.of(toAdd, com.mockneat.mock.interfaces.MockValueFactory.value(mock)));
    return this;
}