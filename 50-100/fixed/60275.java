public void fuehreBerechnungAus() {
    try {
        com.example.patsc.fallstudie.Covered.Preissimulation preissim = new com.example.patsc.fallstudie.Covered.Preissimulation(this);
        getDaten().ASDsetPreisSim(preissim);
        rundeHochladen(this);
        com.example.patsc.fallstudie.Network.RundenErgebnisWrapper[] gegnerliste = gegnerHerunterladen(this);
        com.example.patsc.fallstudie.Covered.Marktsim marktsim = new com.example.patsc.fallstudie.Covered.Marktsim(this, gegnerliste);
        getDaten().ASDserMarktSim(marktsim);
        spielerDatenSpeichern(this);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}