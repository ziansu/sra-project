private boolean isValid(java.lang.String[] inputElements) {
    for (java.lang.String eachInputElement : inputElements) {
        try {
            java.lang.Integer.parseInt(eachInputElement.trim());
        } catch (java.lang.Exception e) {
            this.invalidInput.add(java.util.Arrays.asList(inputElements));
            (this.invalidListCount)++;
            return false;
        }
    }
    return true;
}