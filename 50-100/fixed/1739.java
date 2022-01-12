@java.lang.Override
public void apply(epmc.value.Value result, epmc.value.Value... operands) {
    assert result != null;
    assert operands != null;
    assert (operands.length) >= 1;
    epmc.value.ValueObject.asObject(result).set(((java.lang.Object) (epmc.value.ValueObject.asObject(operands[0]).getObject())));
}