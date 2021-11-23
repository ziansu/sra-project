private void addStep() {
    if (inverted) {
        steps.add((((LaTeX(RHS)) + " = ") + (LaTeX(LHS))));
    }else {
        steps.add((((LaTeX(LHS)) + " = ") + (LaTeX(RHS))));
    }
}