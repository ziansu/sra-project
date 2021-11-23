private void addStep() {
    if (inverted) {
        steps.add(LaTeX((((RHS) + " = ") + (LHS))));
    }else {
        steps.add(LaTeX((((LHS) + " = ") + (RHS))));
    }
}