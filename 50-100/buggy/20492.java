private java.util.Set<org.jlato.internal.parser.Configuration> moveAlong(java.util.Set<org.jlato.internal.parser.Configuration> configurations, org.jlato.internal.parser.Token token) {
    java.util.Set<org.jlato.internal.parser.Configuration> newConfigurations = new java.util.HashSet<org.jlato.internal.parser.Configuration>();
    for (org.jlato.internal.parser.Configuration configuration : configurations) {
        org.jlato.internal.parser.GrammarState target = configuration.state.match(token);
        if ((target == null) || ((commonPrediction(configurations)) != (-1)))
            continue;
        
        org.jlato.internal.parser.Configuration newConfiguration = new org.jlato.internal.parser.Configuration(target, configuration.prediction, configuration.callStack);
        newConfigurations.add(newConfiguration);
    }
    return newConfigurations;
}