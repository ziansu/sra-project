private java.lang.String clampSeekValues(int progress, zeinhijazi.com.pmeas.effects.EffectsDefaults.EffectDefaults effectParam) {
    int seekBarMin = 0;
    if (effectParam.isComplex()) {
        seekBarMin = ((zeinhijazi.com.pmeas.effects.EffectsDefaults.ComplexEffectDefaults) (effectParam)).getMin();
    }else {
        seekBarMin = ((zeinhijazi.com.pmeas.effects.EffectsDefaults.SimpleEffectDefaults) (effectParam)).getMin();
    }
    float clampedProgress = ((float) (progress + seekBarMin)) / (effectParam.getDivideFactor());
    return java.lang.String.valueOf(clampedProgress);
}