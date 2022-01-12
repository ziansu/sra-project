@java.lang.Override
public int floatValueToSliderIntValue(final uk.co.modularaudio.util.mvc.displayslider.SliderDisplayModel sdm, final float inValue) {
    final int numSteps = sdm.getNumSliderSteps();
    final float minValue = sdm.getMinValue();
    final float maxValue = sdm.getMaxValue();
    final float diffValue = maxValue - minValue;
    final float normalisedInVal = (inValue - minValue) / diffValue;
    final float normalisedFloatVal = uk.co.modularaudio.util.math.NormalisedValuesMapper.logMinMaxMapF(normalisedInVal, 0.0F, maxMappedValue);
    final int intVal = ((int) (numSteps * normalisedFloatVal));
    return intVal;
}