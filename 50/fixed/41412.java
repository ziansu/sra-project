@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> add(dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> a, dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> b) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticAddProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticAddProtocol(a, b);
    return builder.append(c);
}