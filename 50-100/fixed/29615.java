@java.lang.Override
public void reset() {
    stack.clear();
    instructions.clear();
    scopes.clear();
    com.besuikerd.autologistics.common.lib.dsl.vm.stackvalue.ClosureValue globalScope = openScope();
    for (java.util.Map.Entry<java.lang.String, com.besuikerd.autologistics.common.lib.dsl.vm.stackvalue.StackValue> entry : globals.entrySet()) {
        globalScope.free.put(entry.getKey(), entry.getValue());
    }
}