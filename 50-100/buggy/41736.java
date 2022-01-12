public void addWeighting(java.lang.String name, float weight) throws com.exception.InvalidWeightingException {
    if ((0 <= weight) && (weight <= 1)) {
        java.lang.Float fWeight = new java.lang.Float(weight);
        courseWeighting.put(name, fWeight);
    }else {
        throw new com.exception.InvalidWeightingException();
    }
}