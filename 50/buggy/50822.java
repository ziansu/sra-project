@java.lang.Override
public rmk35.partIIProject.runtime.numbers.NumberValue subtract(rmk35.partIIProject.runtime.numbers.NumberValue other) {
    return other instanceof rmk35.partIIProject.runtime.numbers.IntegerValue ? new rmk35.partIIProject.runtime.numbers.IntegerValue(((value) - (((rmk35.partIIProject.runtime.numbers.IntegerValue) (other)).value))) : new rmk35.partIIProject.runtime.numbers.RealValue(value).subtract(this);
}