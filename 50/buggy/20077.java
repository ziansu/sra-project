public void ecrireBool() {
    Ecriture.ecrireString(f, "; ");
    super.ecrireBool();
    Ecriture.ecrireString(f, "call ecrbool");
    Ecriture.ecrireStringln(f, "");
}