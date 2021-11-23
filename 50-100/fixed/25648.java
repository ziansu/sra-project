public void GetUniforms(java.util.ArrayList<java.lang.Double> variates) {
    if (OddEven) {
        innerGenerator.GetUniforms(variates);
        nextVariates.clear();
        for (double val : variates) {
            nextVariates.add((1.0 - val));
        }
        OddEven = false;
    }else {
        variates.clear();
        for (double val : nextVariates) {
            variates.add((1.0 - val));
        }
        OddEven = true;
    }
}