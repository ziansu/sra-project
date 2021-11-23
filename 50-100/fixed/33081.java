@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> known(java.math.BigInteger value) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticNativeProtocol<dk.alexandra.fresco.framework.value.SInt> c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticNativeProtocol<dk.alexandra.fresco.framework.value.SInt>() {
        dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt val;

        @java.lang.Override
        public dk.alexandra.fresco.suite.dummy.arithmetic.EvaluationStatus evaluate(int round, dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticResourcePool resourcePool, dk.alexandra.fresco.framework.network.SCENetwork network) {
            val = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt(value);
            return EvaluationStatus.IS_DONE;
        }

        @java.lang.Override
        public dk.alexandra.fresco.framework.value.SInt out() {
            return val;
        }
    };
    return builder.append(c);
}