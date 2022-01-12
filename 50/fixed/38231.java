@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> sub(dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> a, java.math.BigInteger b) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticNativeProtocol<dk.alexandra.fresco.framework.value.SInt> c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSubtractProtocol(a, () -> new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt(b));
    return builder.append(c);
}