@java.lang.Override
public double getLikelihoodCorrection() {
    boolean valid = true;
    for (int tip = 0; (tip < (tipData.length)) && valid; ++tip) {
        valid = validTraitForTip(tip);
    }
    if (valid) {
        return 0;
    }else {
        return (-1) / (1 - (pathParameter));
    }
}