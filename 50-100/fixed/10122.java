public void iand() {
    compiler.Ecriture.ecrireStringln(flux, ";iand");
    compiler.Ecriture.ecrireStringln(flux, "pop bx");
    compiler.Ecriture.ecrireStringln(flux, "pop ax");
    compiler.Ecriture.ecrireStringln(flux, "and ax,bx");
    compiler.Ecriture.ecrireStringln(flux, "push ax");
}