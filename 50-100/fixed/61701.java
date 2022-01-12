public void queue() {
    compiler.Ecriture.ecrireStringln(flux, ";queue");
    compiler.Ecriture.ecrireStringln(flux, "nop");
    compiler.Ecriture.ecrireStringln(flux, "EXITCODE");
    compiler.Ecriture.ecrireStringln(flux, "end debut");
    compiler.Ecriture.fermer(flux);
}