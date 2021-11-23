public void analyzeCallOperands(java.util.ArrayList<backend.codegen.EVT> argVTs, java.util.ArrayList<backend.codegen.ArgFlagsTy> flags, backend.codegen.CCAssignFn fn) {
    for (int idx = 0; idx < (argVTs.size()); idx++) {
        backend.codegen.ArgFlagsTy argFlags = flags.get(idx);
        backend.codegen.EVT argVT = argVTs.get(idx);
        if (fn.apply(idx, argVT, argVT, LocInfo.Full, argFlags, this)) {
            tools.Util.shouldNotReachHere();
        }
    }
}