public java.util.ArrayList<niagaCanvas.Operator> getOperators() {
    java.util.ArrayList<niagaCanvas.Operator> opList = new java.util.ArrayList<niagaCanvas.Operator>();
    for (NiagarinoOperators ops : this.nodes()) {
        if (ops instanceof niagaCanvas.Operator) {
            opList.add(((niagaCanvas.Operator) (ops)));
        }
    }
    return opList;
}