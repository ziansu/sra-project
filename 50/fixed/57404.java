@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> input(java.math.BigInteger value, int inputParty) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticCloseProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticCloseProtocol(inputParty, () -> value);
    return builder.append(c);
}