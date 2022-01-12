@java.lang.Override
public final void mathRender(final org.optimizationBenchmarking.utils.document.spec.IMath out, final org.optimizationBenchmarking.utils.document.spec.IParameterRenderer renderer) {
    try (final org.optimizationBenchmarking.utils.document.spec.IText name = out.name()) {
        this.m_dimension.mathRender(name, renderer);
        name.append((this.m_upper ? org.optimizationBenchmarking.evaluator.attributes.functions._BoundConstant.UPPER_BOUND_END : org.optimizationBenchmarking.evaluator.attributes.functions._BoundConstant.LOWER_BOUND_END));
    }
}