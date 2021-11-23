@java.lang.Override
public bg.tues.DCL.Value evaluate() {
    bg.tues.DCL.Value value = condition.evaluate();
    if (!(value.isBoolean())) {
        throw new java.lang.RuntimeException((("Illegal boolean expression " + "inside while-statement: ") + value));
    }
    while (value.asBoolean()) {
        value = block.evaluate();
        if (value != (bg.tues.DCL.Value.VOID)) {
            return value;
        }
        value = condition.evaluate();
    } 
    return bg.tues.DCL.Value.VOID;
}