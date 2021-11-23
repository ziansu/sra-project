private java.util.Set<java.lang.String> getSystemPropertiesFromTask(io.cloudslang.lang.compiler.modeller.model.Task task) {
    java.util.Set<java.lang.String> result = new java.util.HashSet<>();
    java.util.List<io.cloudslang.lang.compiler.modeller.transformers.Transformer> relevantTransformers = new java.util.ArrayList<>();
    relevantTransformers.add(publishTransformer);
    relevantTransformers.add(aggregateTransformer);
    result.addAll(getSystemPropertiesFromInOutParam(task.getArguments()));
    result.addAll(getSystemPropertiesFromPostTaskActionData(task.getPostTaskActionData(), relevantTransformers, task.getName()));
    return result;
}