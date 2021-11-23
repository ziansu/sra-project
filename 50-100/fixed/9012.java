public void iffaux(java.lang.String etiquette) {
    compiler.Ecriture.ecrireStringln(flux, (";iffaux " + etiquette));
    compiler.Ecriture.ecrireStringln(flux, "pop ax");
    compiler.Ecriture.ecrireStringln(flux, "cmp ax,FALSE");
    compiler.Ecriture.ecrireStringln(flux, ("je " + etiquette));
}