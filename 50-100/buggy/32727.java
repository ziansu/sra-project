@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> randomBit() {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticNativeProtocol<dk.alexandra.fresco.framework.value.SInt> c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticNativeProtocol<dk.alexandra.fresco.framework.value.SInt>() {
        dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt bit;

        @java.lang.Override
        public dk.alexandra.fresco.suite.dummy.arithmetic.EvaluationStatus evaluate(int round, dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticResourcePool resourcePool, dk.alexandra.fresco.framework.network.SCENetwork network) {
            bit = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt(java.math.BigInteger.valueOf(resourcePool.getRandom().nextInt(2)));
            return EvaluationStatus.IS_DONE;
        }

        @java.lang.Override
        public dk.alexandra.fresco.framework.value.SInt out() {
            return bit;
        }
    };
    builder.append(c);
    return c;
}