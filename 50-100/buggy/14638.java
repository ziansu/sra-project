public static edu.stanford.nlp.time.SUTime.Temporal create(edu.stanford.nlp.ling.tokensregex.types.Expressions.CompositeValue compositeValue) {
    edu.stanford.nlp.time.SUTime.StandardTemporalType temporalType = compositeValue.get("type");
    java.lang.String label = compositeValue.get("label");
    java.lang.String modifier = compositeValue.get("modifier");
    edu.stanford.nlp.time.SUTime.Temporal temporal = compositeValue.get("value");
    if (temporal == null) {
        temporal = new edu.stanford.nlp.time.SUTime.PartialTime();
    }
    return edu.stanford.nlp.time.SUTime.createTemporal(temporalType, label, modifier, temporal);
}