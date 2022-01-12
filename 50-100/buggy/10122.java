public void iand() {
    compiler.Ecriture.ecrireStringln(flux, ";iand", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "pop bx", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "pop ax", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "and ax,bx", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "push ax", ((indent) + 1));
}