@java.lang.Override
public dk.alexandra.fresco.framework.Computation<java.math.BigInteger> open(dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> secretShare, int outputParty) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticOpenProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticOpenProtocol(secretShare, outputParty);
    return builder.append(c);
}