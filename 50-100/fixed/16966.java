private boolean stehtNebenMirEinGegnerischerBauer(com.iks.dddschach.domain.validation.Halbzug halbzug, com.iks.dddschach.domain.validation.Spielbrett spielbrett, com.iks.dddschach.domain.validation.Farbe zugFigurFarbe) {
    final com.iks.dddschach.domain.validation.Position feldNebenMir = new com.iks.dddschach.domain.validation.Position(halbzug.to.horCoord, halbzug.from.vertCoord);
    final com.iks.dddschach.domain.validation.Spielfigur generischerBauer = new com.iks.dddschach.domain.validation.Spielfigur(com.iks.dddschach.domain.Spielfigur.FigurenTyp.BAUER, (zugFigurFarbe == (com.iks.dddschach.domain.Farbe.WEISS) ? com.iks.dddschach.domain.Farbe.SCHWARZ : com.iks.dddschach.domain.Farbe.WEISS));
    return generischerBauer.equals(spielbrett.getSchachfigurAnPosition(feldNebenMir));
}