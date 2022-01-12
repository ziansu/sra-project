public com.github.chen0040.gp.treegp.program.Primitive anyPrimitive(com.github.chen0040.gp.services.RandEngine randEngine) {
    double r = randEngine.uniform();
    if (r < 0.3333) {
        return constantSet.any(randEngine);
    }else
        if (r < 0.6666) {
            return variableSet.any(randEngine);
        }else {
            return anyOperator(randEngine);
        }
    
}