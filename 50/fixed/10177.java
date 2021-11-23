@java.lang.Override
public void visit(org.teavm.backend.wasm.model.expression.WasmGetLocal expression) {
    value = new org.teavm.backend.wasm.render.CExpression(("var_" + (expression.getLocal().getIndex())));
}