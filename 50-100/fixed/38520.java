private boolean checkAllRequirements() throws java.io.IOException {
    if (!(checkInterfacesUpperCase())) {
        return false;
    }
    if (!(checkAllMethodsUnique())) {
        return false;
    }
    if (!(checkEndingMethod())) {
        return false;
    }
    return true;
}