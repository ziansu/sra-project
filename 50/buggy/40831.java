public java.lang.Object evalWithResult(java.lang.String cmd) throws java.lang.Exception {
    engine.eval(("result = " + cmd));
    return engine.getVariable("result");
}