private boolean ajouteDansTirsRecus(batailleNavale.Coordonnee c) {
    if (estDansTirsRecus(c)) {
        return false;
    }else {
        batailleNavale.Coordonnee[] tabPlusC = new batailleNavale.Coordonnee[(tirsRecus.length) + 1];
        int i;
        for (i = 0; i < (nbTirsRecus); i++) {
            tabPlusC[i] = tirsRecus[i];
        }
        tabPlusC[i] = c;
        tirsRecus = tabPlusC;
        (nbTirsRecus)++;
        return true;
    }
}