@java.lang.Override
public java.lang.String toString() {
    java.lang.String dimensionString = ((dimensions.length) == 1) ? ("dimension='" + (dimensions[0])) + '\'' : ("dimensions=['" + (com.google.common.base.Joiner.on("', '").join(dimensions))) + "']";
    return (((("JavaScriptDimFilter{" + dimensionString) + ", function='") + (function)) + '\'') + '}';
}