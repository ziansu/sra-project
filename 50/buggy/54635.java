public void startLoop() {
    (loopCounterName)++;
    compiler.Ecriture.ecrireStringln(flux, (("FAIRE" + (loopCounterName)) + ":"), indent);
    labelNameStack.push(new java.lang.Integer(loopCounterName));
    (indent)++;
}