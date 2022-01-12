private boolean isValid(java.lang.String[] inputElements) {
    if ((inputElements.length) == 0)
        return false;
    
    for (java.lang.String eachInputElement : inputElements) {
        try {
            java.lang.Integer.parseInt(eachInputElement.trim());
        } catch (java.lang.Exception e) {
            return false;
        }
    }
    return true;
}