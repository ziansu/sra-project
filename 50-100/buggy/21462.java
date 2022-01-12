private static void ensureSingleStep(com.oracle.truffle.r.nodes.function.FunctionDefinitionNode fdn) {
    com.oracle.truffle.r.nodes.builtin.helpers.DebugHandling.FunctionStatementsEventListener fser = com.oracle.truffle.r.nodes.builtin.helpers.DebugHandling.getFunctionStatementsEventListener(fdn);
    if (fser == null) {
        fser = com.oracle.truffle.r.nodes.builtin.helpers.DebugHandling.attachDebugHandler(fdn, null, null, true, false);
    }else {
        if (fser.disabled()) {
            fser.enable();
            fser.enabledForStepInto = true;
        }
    }
}