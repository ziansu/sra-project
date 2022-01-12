public void iffaux(java.lang.String etiquette) {
    compiler.Ecriture.ecrireStringln(flux, (";iffaux " + etiquette), ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "pop ax", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, "cmp ax,FALSE", ((indent) + 1));
    compiler.Ecriture.ecrireStringln(flux, ("je " + etiquette), ((indent) + 1));
}