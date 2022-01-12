public java.lang.Object evalWithResult(java.lang.String cmd) throws java.lang.Exception {
    eval(("result = " + cmd));
    return engine.getVariable("result");
}