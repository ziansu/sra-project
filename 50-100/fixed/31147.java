public java.lang.Double eval(java.lang.String toEval) throws West.Math.Exception.NotDefinedException {
    isolate(toEval);
    if ((equations().size()) == 0) {
        West.Math.Print.printw("Trying to evaluated an EquationSystem with no equations! returning 0");
        return 0.0;
    }
    return equations().get(0).expressions().get(0).get(0).eval(copy());
}