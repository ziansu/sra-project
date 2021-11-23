public int getPulseWidthForPercentage(final int percentage) {
    if ((percentage > 100) || (percentage < (-100))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Percentage of pulse width should be between -100%% and +100%% (was %s).", percentage));
    }
    final int pulseWidth;
    if (percentage >= 0) {
        pulseWidth = (neutralPulseWidth) + (calculatePercentage(percentage, positivePulseWidthRange));
    }else {
        pulseWidth = (neutralPulseWidth) - (calculatePercentage(percentage, negativePulseWidthRange));
    }
    return pulseWidth;
}