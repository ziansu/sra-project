com.google.javascript.jscomp.newtypes.FunctionType specialize(com.google.javascript.jscomp.newtypes.FunctionType other) {
    if ((other == null) || ((!(this.isLoose())) && (other.isLoose()))) {
        return this;
    }else {
        com.google.javascript.jscomp.newtypes.FunctionType result = com.google.javascript.jscomp.newtypes.FunctionType.meet(this, other);
        if ((this.isLoose) && (!(result.isLoose()))) {
            result = result.withLoose();
        }
        return result;
    }
}