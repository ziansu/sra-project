@java.lang.Override
public void angreifen(pkg.Charakter gegner) {
    int schaden = random.getRandom(15, 25);
    if ((this.getSpezialfaehigkeit()) == true) {
        this.wahrscheinlichkeit();
        if ((this.wahrscheinlichkeit()) == true) {
            java.lang.System.out.println("Erfolgreich!");
            this.schadenNehmen((schaden * 2));
        }else
            schaden = schaden / 2;
        
    }
    super.angreifen(gegner);
    gegner.schadenNehmen(schaden);
}