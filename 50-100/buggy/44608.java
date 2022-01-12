public static net.nexustools.njs.BaseObject callTop(java.lang.String source, java.lang.String key, net.nexustools.njs.BaseObject _this, net.nexustools.njs.BaseObject... params) {
    net.nexustools.njs.BaseFunction function;
    try {
        function = ((net.nexustools.njs.BaseFunction) (_this.get(key)));
    } catch (java.lang.ClassCastException ex) {
        throw new java.lang.Error.JavaException("ReferenceError", (source + " is not a function"));
    }
    return function.call(_this, params);
}