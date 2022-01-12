private boolean checkAllRequirements(java.util.List<generator.GeneratorScope> genScopeList) throws java.io.IOException {
    if (!(checkInterfacesUpperCase())) {
        return false;
    }
    if (!(checkAllMethodsUnique(genScopeList))) {
        return false;
    }
    if (!(checkEndingMethod(genScopeList))) {
        return false;
    }
    return true;
}