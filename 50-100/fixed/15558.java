public void elseIf() {
    int id = ((int) (labelNameStack.pop()));
    java.lang.String etiquette = ("FSI" + id) + ":";
    jump(etiquette);
    compiler.Ecriture.ecrireStringln(flux, (("SINON" + id) + ":"));
    labelNameStack.push(new java.lang.Integer(id));
}