public void endIf() {
    int id = ((int) (labelNameStack.pop()));
    compiler.Ecriture.ecrireStringln(flux, (("FSI" + id) + ":"), indent);
    (indent)--;
}