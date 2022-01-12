public org.renjin.primitives.SEXP doApply(org.renjin.primitives.Context callContext, org.renjin.primitives.Environment callEnvironment, org.renjin.primitives.PairList args) {
    org.renjin.primitives.FunctionCall newCall = new org.renjin.primitives.FunctionCall(method, args);
    callContext.setState(org.renjin.primitives.S3.GenericMethod.class, this);
    if ((function) instanceof org.renjin.primitives.Closure) {
        return org.renjin.primitives.Calls.applyClosure(((org.renjin.primitives.Closure) (function)), callContext, callEnvironment, newCall, args, callEnvironment, persistChain());
    }else {
        return function.apply(callContext, callEnvironment, newCall, args);
    }
}