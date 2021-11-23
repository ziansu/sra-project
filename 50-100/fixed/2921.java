public java.lang.String play(guru.bonacci.oogway.sannyas.general.Sannyasin sannya, java.lang.String input) {
    java.util.function.Function<java.lang.String, java.lang.String> preprocessing = sannya.preprocessingSteps().stream().reduce(java.util.function.Function.identity(), java.util.function.Function::andThen);
    preprocessing = preprocessing.andThen(duplicateRemover);
    java.lang.String preprocessedInput = preprocessing.apply(input);
    logger.info(((((sannya.getClass()) + "- Preprocessed input: '") + preprocessedInput) + "'"));
    return preprocessedInput;
}