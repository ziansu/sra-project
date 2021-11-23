@java.lang.Override
public dk.alexandra.fresco.framework.Computation<java.math.BigInteger> open(dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> secretShare) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticOpenToAllProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticOpenToAllProtocol(secretShare);
    builder.append(c);
    return c;
}