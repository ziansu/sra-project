@java.lang.Override
public float estimateCost(joshua.decoder.ff.tm.Rule rule, int sentID) {
    if (rule != null)
        return ((OMEGA) * ((rule.getEnglish().length) - (rule.getArity()))) * (weights.get(name));
    
    return 0.0F;
}