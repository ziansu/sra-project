private void assureChecked(final org.deidentifier.arx.framework.lattice.Transformation transformation) {
    if (!(transformation.hasProperty(propertyChecked))) {
        transformation.setChecked(checker.check(transformation, true));
        trackOptimum(transformation);
        progress((((double) ((java.lang.System.currentTimeMillis()) - (timeStart))) / ((double) (timeLimit))));
    }
}