private java.lang.String makeWord() {
    java.lang.String word = makeSyllable();
    double cutoff;
    switch (monosylProb) {
        default :
        case ALWAYS :
            return word;
        case MOSTLY :
            cutoff = 0.6;
            break;
        case FREQUENT :
            cutoff = 0.45;
            break;
        case LESS :
            cutoff = 0.3;
            break;
        case RARE :
            cutoff = 0.15;
            break;
        case CUSTOM :
            cutoff = monosylProbCustom;
    }
    double jump = rand.nextDouble();
    if (jump > cutoff) {
        word += makeWord();
    }
    return word;
}