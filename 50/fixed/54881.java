private static com.oracle.truffle.r.runtime.env.REnvironment getEnv(com.oracle.truffle.api.frame.Frame frame) {
    if (com.oracle.truffle.r.runtime.RArguments.isRFrame(frame)) {
        return com.oracle.truffle.r.runtime.env.REnvironment.frameToEnvironment(frame.materialize());
    }
    return null;
}