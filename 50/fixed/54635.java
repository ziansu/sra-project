public void startLoop() {
    (loopCounterName)++;
    compiler.Ecriture.ecrireStringln(flux, (("FAIRE" + (loopCounterName)) + ":"));
    labelNameStack.push(new java.lang.Integer(loopCounterName));
    (indent)++;
}