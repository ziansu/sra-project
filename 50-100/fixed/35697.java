public double[] getOptionalDoubleArrayParameter(final java.lang.String parameterName, final double[] deflt) {
    assert parameterName != null;
    assert !(parameterName.isEmpty());
    assert deflt != null;
    final SigmaEC.util.Option<double[]> opt = getOptionalDoubleArrayParameter(parameterName);
    return opt.isDefined() ? opt.get() : deflt;
}