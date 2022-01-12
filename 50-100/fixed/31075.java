public void endLoop() {
    int id = ((int) (loopDepthStack.pop()));
    jump((("FAIRE" + id) + " :"));
    (indent)--;
    compiler.Ecriture.ecrireStringln(flux, (("FAIT" + id) + ":"), indent);
}