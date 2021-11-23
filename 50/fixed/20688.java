@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> add(java.math.BigInteger a, dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> b) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticAddProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticAddProtocol(() -> new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt(a), b);
    return builder.append(c);
}