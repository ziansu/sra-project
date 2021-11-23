public boolean isValid() {
    java.util.List<abstractPattern.Name> dimensionSignature = this.getDimensionSignature();
    abstractPattern.Name typeSignature = this.getTypeSignature();
    if ((dimensionSignature.getNumChild()) == 0)
        return false;
    
    return true;
}