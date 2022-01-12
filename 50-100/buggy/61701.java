public void queue() {
    compiler.Ecriture.ecrireStringln(flux, ";queue", 1);
    compiler.Ecriture.ecrireStringln(flux, "nop", 1);
    compiler.Ecriture.ecrireStringln(flux, "EXITCODE", 1);
    compiler.Ecriture.ecrireStringln(flux, "end debut", 1);
    compiler.Ecriture.fermer(flux);
}