@java.lang.Override
public bg.tues.DCL.Value evaluate() {
    initExpression.evaluate();
    bg.tues.DCL.Value value = condition.evaluate();
    if (!(value.isBoolean())) {
        throw new java.lang.RuntimeException((("Illegal boolean expression " + "inside for-statement: ") + value));
    }
    for (initExpression.evaluate(); condition.evaluate().asBoolean(); aftExpression.evaluate()) {
        value = block.evaluate();
        if (value != (bg.tues.DCL.Value.VOID)) {
            return value;
        }
    }
    return bg.tues.DCL.Value.VOID;
}