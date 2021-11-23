private shef.mutation.Declaration getDeclarationFromRuleBlock(shef.mutation.Declaration chosen, shef.mutation.RuleSet toMutate) {
    try {
        for (shef.mutation.Declaration d : toMutate.asList()) {
            if (chosen.getProperty().equals(d.getProperty())) {
                return d;
            }
        }
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println((toMutate == null));
    }
    return null;
}