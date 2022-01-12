public final void ApplyWeights(final MLPerceptron.TeachingPolicies.TeachingPolicy teachingPolicy) {
    for (MLPerceptron.Layer layer : layers)
        layer.ApplyWeights();
    
}