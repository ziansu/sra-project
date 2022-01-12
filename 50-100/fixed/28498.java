@org.junit.Before
public void prepareTest() {
    final java.util.List<openfasttrack.core.SpecificationItem> items = java.util.Arrays.asList(openfasttrack.core.TestTracer.A, openfasttrack.core.TestTracer.B, openfasttrack.core.TestTracer.C, openfasttrack.core.TestTracer.D, openfasttrack.core.TestTracer.E, openfasttrack.core.TestTracer.F, openfasttrack.core.TestTracer.G, openfasttrack.core.TestTracer.H, openfasttrack.core.TestTracer.I, openfasttrack.core.TestTracer.J, openfasttrack.core.TestTracer.K1, openfasttrack.core.TestTracer.K2, openfasttrack.core.TestTracer.L, openfasttrack.core.TestTracer.M1, openfasttrack.core.TestTracer.M2, openfasttrack.core.TestTracer.N);
    final openfasttrack.core.Tracer tracer = new openfasttrack.core.Tracer();
    this.trace = tracer.trace();
}