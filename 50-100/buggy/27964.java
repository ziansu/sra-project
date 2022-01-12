private void init() {
    Gdx.input.setInputProcessor(this);
    vitesseAlien = 0.5F;
    sauvegardeDescente = utils.Constants.DESCENTE_AVANT_STABILISATION;
    lives = 1;
    lastMissile = com.badlogic.gdx.utils.TimeUtils.nanoTime();
    gestionVitesseChute = com.badlogic.gdx.utils.TimeUtils.nanoTime();
    indiceDesColonnesQuiTire = new java.util.ArrayList<java.lang.Integer>();
    compteurOrdonnancement = 0;
    colonneDejaDetruite = new java.util.ArrayList<java.lang.Integer>();
    vitesseTank = 5.0F;
}