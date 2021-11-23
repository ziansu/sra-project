public boolean grösserGleich(de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geldbetrag g) {
    return ((this.centAnteil()) + ((this.euroAnteil()) * 100)) >= ((g.centAnteil()) + ((g.euroAnteil()) * 100));
}