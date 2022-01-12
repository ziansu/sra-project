private void setSeekBarValues(org.adw.library.widgets.discreteseekbar.DiscreteSeekBar.NumericTransformer transformers, int min, int max, int current) {
    mSeekBar.setMin(min);
    mSeekBar.setMax(max);
    mSeekBar.setProgress(current);
    mSeekBar.setNumericTransformer(transformers);
}