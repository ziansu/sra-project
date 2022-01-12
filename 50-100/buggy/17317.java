@java.lang.Override
public boolean numberEquals(rmk35.partIIProject.runtime.numbers.NumberValue other) {
    return ((other instanceof rmk35.partIIProject.runtime.numbers.IntegerValue) && ((value) == (((rmk35.partIIProject.runtime.numbers.IntegerValue) (other)).value))) || ((other instanceof rmk35.partIIProject.runtime.numbers.RealValue) && ((value) == (((rmk35.partIIProject.runtime.numbers.RealValue) (other)).value)));
}