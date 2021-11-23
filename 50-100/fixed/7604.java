public void analyze() {
    boolean error = false;
    for (nez.lang.Production p : this.peg.getProductionList()) {
        if (!(this.analizeConsumption(p.getExpression()))) {
            error = true;
        }
    }
    if (error) {
        nez.util.ConsoleUtils.exit(1, "Grammar Error");
    }
}