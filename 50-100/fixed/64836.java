@java.lang.Override
public float estimateCost(joshua.decoder.ff.tm.Rule rule, int sentID) {
    if (rule != null)
        return ((weights.get(name)) * (OMEGA)) * ((rule.getEnglish().length) - (rule.getArity()));
    
    return 0.0F;
}