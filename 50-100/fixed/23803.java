private void normalize(double factor, double fwhm, double intensityCutoff) {
    result.cutoff(intensityCutoff);
    switch (joiningAlgorithm) {
        case org.chemcalc.core.SpectrumCalculator.JOINING_MAIN_PEAK :
            result.combine(fwhm);
            break;
        case org.chemcalc.core.SpectrumCalculator.JOINING_CENTER_MASS :
            result.combineProportional(fwhm);
            break;
    }
    result.normalize(factor);
}