static int nonExplodedLoop(int x) {
    if ((x >= 0) && (x < 50)) {
        int result = 0;
        for (int i = 0; i < x; i++) {
            result++;
            if (result > 100) {
                com.oracle.truffle.api.CompilerDirectives.transferToInterpreter();
            }
        }
        if (result > 100) {
            com.oracle.graal.truffle.test.BytecodeInterpreterPartialEvaluationTest.boundary();
            com.oracle.graal.truffle.test.BytecodeInterpreterPartialEvaluationTest.boundary();
        }
        return result;
    }else {
        return x;
    }
}