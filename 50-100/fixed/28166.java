private boolean hasCorrectParamTypes(java.util.ArrayList<java.lang.String> foundParams, java.lang.String[] targetParams) {
    int j = 0;
    for (java.lang.String paramType : targetParams) {
        if ((j > (foundParams.size())) || ((foundParams.size()) != (targetParams.length))) {
            return false;
        }
        if (!(foundParams.get(j).equals(targetParams[j]))) {
            return false;
        }
        j++;
    }
    return true;
}