protected final C emitBack(java.lang.String name, C expr) {
    java.lang.String uFunc = "back" + name;
    if (this.isDefined(uFunc)) {
        expr = this.emitFunc(uFunc, this.V("px"), expr);
    }
    return this.emitSetter(this.V("px"), name, expr);
}