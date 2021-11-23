public Calculator.ReflectionFunction Copy() throws java.lang.Exception {
    Calculator.ReflectionFunction reflectionFunction = new Calculator.ReflectionFunction(rawText, this.reflectionFunction);
    reflectionFunction.current_paramters = this.current_paramters;
    return reflectionFunction;
}