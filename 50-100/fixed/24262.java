public void setTypeBasedOptimizationOptions(com.google.javascript.jscomp.CompilerOptions options) {
    switch (this) {
        case ADVANCED_OPTIMIZATIONS :
            options.setDisambiguateProperties(true);
            options.setAmbiguateProperties(true);
            options.setInlineProperties(true);
            options.setUseTypesForLocalOptimization(true);
            break;
        case SIMPLE_OPTIMIZATIONS :
        case WHITESPACE_ONLY :
            break;
    }
}