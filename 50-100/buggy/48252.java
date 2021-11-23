public void entete() {
    YVMasm.compteur = 0;
    Ecriture.ecrireStringln(f, "; entete");
    Ecriture.ecrireStringln(f, "extrn lirent:proc, ecrent:proc");
    Ecriture.ecrireStringln(f, "extrn ecrbool:proc");
    Ecriture.ecrireStringln(f, "extrn ecrch:proc");
    Ecriture.ecrireStringln(f, "extrn ligsuiv:proc");
    Ecriture.ecrireStringln(f, ".model SMALL");
    Ecriture.ecrireStringln(f, ".586");
    Ecriture.ecrireStringln(f, ".CODE");
    Ecriture.ecrireStringln(f, "");
}