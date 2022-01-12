@java.lang.Override
public java.lang.String toString() {
    java.lang.String geneString = "";
    for (int i = 0; i < (size()); i++) {
        geneString += (getGene(i)) + " ";
        return geneString;
    }
    geneString += "Routes: ";
    for (int i = 0; i < (ROUTES); i++) {
        geneString += getRouteLength(i);
    }
    return geneString;
}