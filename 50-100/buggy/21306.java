private bnf_formulae.BooleanFormula negativeScenarioTermination(boolean isGlobal) {
    final bnf_formulae.FormulaList constraints = new bnf_formulae.FormulaList(bnf_formulae.BinaryOperations.AND);
    for (structures.plant.MooreNode node : (isGlobal ? globalNegativeForest : negativeForest).terminalNodes()) {
        for (int nodeColor = 0; nodeColor < (colorSize); nodeColor++) {
            constraints.add(algorithms.formula_builders.PlantFormulaBuilder.xxVar(node.number(), nodeColor, isGlobal).not());
        }
    }
    java.lang.System.out.println(constraints);
    return constraints.assemble("negative scenario termination");
}